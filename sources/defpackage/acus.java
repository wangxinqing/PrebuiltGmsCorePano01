package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: acus  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acus {
    public final Map a = new HashMap();

    public static final String b(byte[] bArr) {
        int hashCode = Arrays.hashCode(bArr);
        StringBuilder sb = new StringBuilder(14);
        sb.append("sig");
        sb.append(hashCode);
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final Map a() {
        return Collections.unmodifiableMap(new HashMap(this.a));
    }

    /* access modifiers changed from: package-private */
    public final void a(byte[] bArr) {
        this.a.put(b(bArr), bArr);
    }
}
