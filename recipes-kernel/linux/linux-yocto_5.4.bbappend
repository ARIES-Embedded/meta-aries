FILESEXTRAPATHS_prepend := "${THISDIR}/config:${THISDIR}/linux-yocto-5.4:"

SRC_URI_append = " file://aries;type=kmeta;destsuffix=aries "
KERNEL_FEATURES_append_m28evk = " bsp/m28evk/m28evk.scc "
KERNEL_FEATURES_append_m53evk = " bsp/m53evk/m53evk.scc "
KERNEL_FEATURES_append_ma5d4evk = " bsp/ma5d4evk/ma5d4evk.scc "

COMPATIBLE_MACHINE_m28evk = "m28evk"
COMPATIBLE_MACHINE_m53evk = "m53evk"
COMPATIBLE_MACHINE_ma5d4evk = "ma5d4evk"

KERNEL_VERSION_SANITY_SKIP="1"

SRC_URI_append_ma5d4evk = " \
	file://0001-drm-panel-Add-support-for-Ampire-AM-800480R2-800x480.patch \
	file://0002-ARM-at91-dt-sama5d4-Adjust-DTS-for-released-board-ve.patch \
	file://0003-ARM-at91-dt-sama5d4-Add-support-for-DENX-MA5D4-SoM-a.patch \
	file://0004-ARM-at91-dt-sama5d4-fix-duplicate-usb-labels-in-the-.patch \
	file://0005-ARM-at91-dt-ma5d4evk-clean-up-model-names-in-device-.patch \
	file://0006-ARM-at91-dt-ma5d4evk-fix-GPIO-used-for-SD-card-detec.patch \
	"

SRC_URI_append_m53evk = " \
	file://0001-drm-panel-Add-support-for-Ampire-AM-800480R2-800x480.patch \
	"

SRC_URI_append_m28evk = " \
	file://0001-drm-panel-Add-support-for-Ampire-AM-800480R2-800x480.patch \
	file://0007-ARM-dts-imx28-m28-cleanup-model-and-compatibility-na.patch \
	file://0008-ARM-dts-imx28-m28evk-Convert-to-the-new-display-bind.patch \
	"
