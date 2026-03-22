// swift-tools-version:5.8
import PackageDescription

let packageName = "Shared"

let package = Package(
    name: packageName,
    platforms: [
        .iOS(.v14)
    ],
    products: [
        .library(
            name: packageName,
            targets: [packageName]
        ),
    ],
    targets: [
        .binaryTarget(
            name: packageName,
            path: "./shared/build/XCFrameworks/debug/\(packageName).xcframework"
        )
        ,
    ]
)