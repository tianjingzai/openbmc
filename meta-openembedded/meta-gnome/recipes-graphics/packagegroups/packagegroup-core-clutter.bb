#
# Copyright (C) 2007 OpenedHand Ltd.
#

SUMMARY = "Clutter package groups"

PR = "r6"

inherit packagegroup features_check
# rdepends on clutter-*
REQUIRED_DISTRO_FEATURES = "opengl"

PACKAGES = "\
    ${PN}-core \
    "

SUMMARY:${PN}-core = "Clutter graphics library"
RDEPENDS:${PN}-core = "\
    clutter-1.0 \
    clutter-gst-3.0 \
    clutter-gtk-1.0 \
    "
