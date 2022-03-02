package defpackage;

import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: apdk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum apdk {
    NULL(0),
    STRING_POOL(1),
    TABLE(2),
    XML(3),
    XML_START_NAMESPACE(PSKKeyManager.MAX_KEY_LENGTH_BYTES),
    XML_END_NAMESPACE(257),
    XML_START_ELEMENT(258),
    XML_END_ELEMENT(259),
    XML_CDATA(260),
    XML_RESOURCE_MAP(384),
    TABLE_PACKAGE(512),
    TABLE_TYPE(513),
    TABLE_TYPE_SPEC(514),
    TABLE_LIBRARY(515),
    TABLE_OVERLAYABLE(516),
    TABLE_OVERLAYABLE_POLICY(517);
    
    public static final Map r = null;
    public final short q;

    static {
        int i;
        HashMap hashMap = new HashMap();
        for (apdk apdk : values()) {
            hashMap.put(Short.valueOf(apdk.q), apdk);
        }
        r = Collections.unmodifiableMap(hashMap);
    }

    private apdk(int i) {
        boolean z;
        long j = (long) i;
        int i2 = (int) j;
        if (((long) i2) == j) {
            z = true;
        } else {
            z = false;
        }
        amrl.a(z, "Out of range: %s", j);
        this.q = (short) i2;
    }
}
