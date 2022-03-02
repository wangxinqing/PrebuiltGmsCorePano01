package defpackage;

import com.google.android.gms.drive.metadata.CustomPropertyKey;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties;
import com.google.android.gms.drive.metadata.internal.CustomProperty;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: lbh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lbh {
    private final Map a = new HashMap();

    public final AppVisibleCustomProperties a() {
        return new AppVisibleCustomProperties(this.a.values());
    }

    public final void a(CustomPropertyKey customPropertyKey, String str) {
        iva.a((Object) customPropertyKey, (Object) "key");
        this.a.put(customPropertyKey, new CustomProperty(customPropertyKey, str));
    }

    public final void a(AppVisibleCustomProperties appVisibleCustomProperties) {
        iva.a((Object) appVisibleCustomProperties);
        Iterator it = appVisibleCustomProperties.iterator();
        while (it.hasNext()) {
            a((CustomProperty) it.next());
        }
    }

    public final void a(CustomProperty customProperty) {
        iva.a((Object) customProperty, (Object) "property");
        this.a.put(customProperty.a, customProperty);
    }
}
