# Simple commissioning initramfs image.
DESCRIPTION = "Small SD card image for commissioning purposes."

PACKAGE_INSTALL = "initramfs-live-boot ${VIRTUAL-RUNTIME_base-utils} udev base-passwd ${ROOTFS_BOOTSTRAP_INSTALL} dropbear parted u-boot-fw-utils e2fsprogs-resize2fs"

# Do not pollute the initrd image with rootfs features
IMAGE_FEATURES = ""

export IMAGE_BASENAME = "core-image-minimal-comm"
IMAGE_LINGUAS = ""

LICENSE = "MIT"

IMAGE_FSTYPES = " wic.xz "
INITRAMFS_IMAGE_BUNDLE = "1"
WKS_FILE = "sdimage-${MACHINE}-comm.wks"

inherit core-image

IMAGE_ROOTFS_SIZE = "8192"
IMAGE_ROOTFS_EXTRA_SPACE = "0"

BAD_RECOMMENDATIONS += "busybox-syslog"
