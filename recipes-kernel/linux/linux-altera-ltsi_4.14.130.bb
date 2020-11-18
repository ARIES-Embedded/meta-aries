LINUX_VERSION = "4.14.130"
LINUX_VERSION_SUFFIX = "-ltsi"

SRCREV = "cae629555019eb0d3f63d9e8e639a982e994e80f"

include linux-altera.inc

FILESEXTRAPATHS_prepend := "${THISDIR}/config::${THISDIR}/linux-altera-ltsi-4.14:"

SRC_URI_append_mcvevk = " \
	file://lbdaf.scc \
	file://0001-socfpga-mcvevk-clean-up-model-names-in-device-tree-f.patch \
	file://0002-socfpga-mcvevk-framebuffer-support-for-the-Altera-VI.patch \
	"
