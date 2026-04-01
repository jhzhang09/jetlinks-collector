package org.jetlinks.collector.info;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hswebframework.web.i18n.LocaleUtils;
import org.jetlinks.core.codec.Codec;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CodecInfo {
    private String id;
    private String name;
    private Integer length;

    public String getName() {
        return LocaleUtils.resolveMessage("message.codec." + id + ".name", name);
    }

    public static CodecInfo of(Codec<?> provider) {
        return new CodecInfo(provider.getId(), provider.getName(), provider.byteLength());
    }
}
