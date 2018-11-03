package magnet.processor.registry

import com.squareup.javapoet.ClassName

class Model private constructor() {

    class Registry(
        val instanceFactories: List<InstanceFactory>,
        val scopeFactories: List<ScopeFactory>
    )

    class InstanceFactory(
        val factoryClass: ClassName,
        val instanceType: ClassName,
        val classifier: String
    )

    class ScopeFactory(
        val factoryClass: ClassName,
        val instanceType: ClassName
    )

}
