package defpackage;

import android.net.Uri;
import com.google.android.gms.common.data.DataHolder;
import java.util.HashMap;
import java.util.Map;

/* renamed from: aeag  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aeag extends ilj implements adyl {
    private final int c;

    public aeag(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.c = i2;
    }

    public final Uri a() {
        return Uri.parse(d("path"));
    }

    public final byte[] b() {
        return e("data");
    }

    public final Map c() {
        HashMap hashMap = new HashMap(this.c);
        for (int i = 0; i < this.c; i++) {
            aead aead = new aead(this.a, this.b + i);
            if (aead.b() != null) {
                hashMap.put(aead.b(), aead);
            }
        }
        return hashMap;
    }

    public final /* bridge */ /* synthetic */ Object r() {
        return new aeae(this);
    }

    public final String toString() {
        Object obj;
        byte[] b = b();
        Map c2 = c();
        StringBuilder sb = new StringBuilder("DataItemRef{ ");
        String valueOf = String.valueOf(a());
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 4);
        sb2.append("uri=");
        sb2.append(valueOf);
        sb.append(sb2.toString());
        if (b != null) {
            obj = Integer.valueOf(b.length);
        } else {
            obj = "null";
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 9);
        sb3.append(", dataSz=");
        sb3.append(valueOf2);
        sb.append(sb3.toString());
        int size = c2.size();
        StringBuilder sb4 = new StringBuilder(23);
        sb4.append(", numAssets=");
        sb4.append(size);
        sb.append(sb4.toString());
        sb.append(" }");
        return sb.toString();
    }
}
