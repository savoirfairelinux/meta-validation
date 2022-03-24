SUMMARY = "cukinia"
DESCRIPTION = "Cukinia is designed to help Linux-based embedded firmware developers run simple validation tests on their firmware"
HOMEPAGE = "https://github.com/savoirfairelinux/cukinia"
LICENSE = "Apache-2.0 | GPL-3.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e"

SRC_URI = "git://github.com/savoirfairelinux/cukinia.git;branch=master;protocol=https"
SRCREV = "${AUTOREV}"
PV = "master+git${SRCPV}"

S = "${WORKDIR}/git"

do_install () {
    install -d ${D}${bindir}
    install -m 0755 ${S}/cukinia ${D}${bindir}
    install -d ${D}${sysconfdir}/cukinia
}

inherit allarch
