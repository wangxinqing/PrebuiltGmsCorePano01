package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: aeae  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aeae implements adyl {
    private Uri a;
    private byte[] b;
    private Map c;

    public aeae(adyl adyl) {
        this.a = adyl.a();
        this.b = adyl.b();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : adyl.c().entrySet()) {
            if (entry.getKey() != null) {
                hashMap.put((String) entry.getKey(), (adym) ((adym) entry.getValue()).r());
            }
        }
        this.c = Collections.unmodifiableMap(hashMap);
    }

    public final Uri a() {
        throw null;
    }

    public final byte[] b() {
        throw null;
    }

    public final Map c() {
        throw null;
    }

    public final /* bridge */ /* synthetic */ Object r() {
        return this;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("DataItemEntity{ ");
        String valueOf = String.valueOf(this.a);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 4);
        sb2.append("uri=");
        sb2.append(valueOf);
        sb.append(sb2.toString());
        byte[] bArr = this.b;
        if (bArr != null) {
            obj = Integer.valueOf(bArr.length);
        } else {
            obj = "null";
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 9);
        sb3.append(", dataSz=");
        sb3.append(valueOf2);
        sb.append(sb3.toString());
        int size = this.c.size();
        StringBuilder sb4 = new StringBuilder(23);
        sb4.append(", numAssets=");
        sb4.append(size);
        sb.append(sb4.toString());
        sb.append(" }");
        return sb.toString();
    }
}
