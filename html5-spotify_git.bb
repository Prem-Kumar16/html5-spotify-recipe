SUMMARY     = "Free music streaming"
HOMEPAGE    = "https://github.com/Prem-Kumar16/html5-spotify"
SECTION     = "apps"
LICENSE     = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

PV      = "1.0+git${SRCPV}"
S       = "${WORKDIR}/git"
B       = "${WORKDIR}/build"

SRC_URI = "git://github.com/Prem-Kumar16/html5-spotify;protocol=https;branch=main"
SRCREV = "017e3b356ca92ed3090392d5f8ed13f9231cba0d"

inherit pythonnative agl-app

AGL_APP_TEMPLATE = "agl-app-web"
AGL_APP_ID = "webapps-spotify"
AGL_APP_NAME = "SPOTIFY"

WAM_APPLICATIONS_DIR = "${libdir}/wam_apps"

do_install() {
  install -d ${D}${WAM_APPLICATIONS_DIR}/${PN}
  cp -R --no-dereference --preserve=mode,links ${S}/* ${D}${WAM_APPLICATIONS_DIR}/${PN}
}

FILES:${PN} = "${WAM_APPLICATIONS_DIR}/${PN}"
