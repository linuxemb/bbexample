# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=96af5705d6f64a88e035781ef00e98a8"

SRC_URI = "git://github.com/linuxemb/bbexample;protocol=https"

SRCREV= "${AUTOREV}"
PE="1"


# Modify these as desired
PV = "1.0+git${SRCPV}"
#SRCREV = "ece3cef9abc95cb77c931f9f27860102e43cc1d9"
S = "${WORKDIR}/git"
BB_GENERATE_MIRROR_TARBALLS="1"

# NOTE: if this software is not capable of being built in a separate build directory
# from the source, you should replace autotools with autotools-brokensep in the
# inherit line
inherit autotools

# Specify any options you want to pass to the configure script using EXTRA_OECONF:
EXTRA_OECONF = ""

