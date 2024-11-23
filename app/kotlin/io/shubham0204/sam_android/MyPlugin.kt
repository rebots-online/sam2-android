class MyPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        configureCommonExtension(target)
        // ... other plugin logic ...
    }
}