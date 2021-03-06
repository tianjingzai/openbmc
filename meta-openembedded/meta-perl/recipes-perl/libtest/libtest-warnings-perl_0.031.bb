# Copyright (C) 2020 Jens Rehsack <sno@netbsd.org>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "If you've ever tried to use Test::NoWarnings to confirm there are no \
warnings generated by your tests, combined with the convenience of \
\\"done_testing\\" to not have to declare a test count, you'll have discovered \
that these two features do not play well together, as the test count will \
be calculated *before* the warnings test is run, resulting in a TAP error. \
(See "examples/test_nowarnings.pl" in this distribution for a \
demonstration.)"

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"

HOMEPAGE=       "https://metacpan.org/release/Test-Warnings"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/Test-Warnings-${PV}.tar.gz"

SRC_URI[sha256sum] = "1e542909fef305e45563e9878ea1c3b0c7cef1b28bb7ae07eba2e1efabec477b"

S = "${WORKDIR}/Test-Warnings-${PV}"

inherit cpan ptest-perl

BBCLASSEXTEND = "native nativesdk"
