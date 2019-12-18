package magnet.processor.instances.parser

import magnet.processor.instances.aspects.disposer.DisposerValidator
import magnet.processor.instances.aspects.limitedto.LimitedToValidator
import magnet.processor.instances.aspects.type.TypeAndTypesValidator
import javax.lang.model.element.Element

interface AspectValidator {
    fun ParserInstance.validate(element: Element): ParserInstance

    object Registry {
        val VALIDATORS: List<AspectValidator> = listOf(
            TypeAndTypesValidator,
            DisposerValidator,
            LimitedToValidator
        )
    }
}
