SUMMARY = "Encrypted storage management daemon"
DESCRIPTION = "Provides a D-Bus interface to manage an encrypted storage device"
PR = "r1"
PV = "0.1+git${SRCPV}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e"
inherit meson pkgconfig

DEPENDS += "phosphor-dbus-interfaces"
DEPENDS += "cryptsetup"
DEPENDS += "openssl"
DEPENDS += "phosphor-logging"
DEPENDS += "sdbusplus"
DEPENDS += "stdplus"

RDEPENDS:${PN} += "e2fsprogs"

S = "${WORKDIR}/git"
SRC_URI = "git://github.com/openbmc/estoraged.git"
SRCREV = "7f2ab6432a5f3aeb2ecf131169a3d44569007f1c"
