SUMMARY = "Ultralytics YOLOv8 for SOTA object detection, multi-object tracking, instance segmentation, pose estimation and image classification."
LICENSE = "AGPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=eb1e647870add0502f8f010b19de32af"

DEPENDS = "python3-numpy-native"

inherit pypi python_setuptools_build_meta

SRC_URI[sha256sum] = "f4310b1c0ab259afb45d9adb900864a506c2909d70ddc33568fd10b4f74fdd92"

RDEPENDS:${PN} = " \
	bash \
	python3-matplotlib \
	python3-opencv \
	python3-pillow \
	python3-pyyaml \
	python3-requests \
	python3-scipy \
	python3-pytorch \
	python3-torchvision \
	python3-tqdm \
	python3-pandas \
	python3-seaborn \
	python3-psutil \
	python3-ultralytics-thop \
	python3-ipython \
	python3-dill \
	python3-py-cpuinfo \
"
