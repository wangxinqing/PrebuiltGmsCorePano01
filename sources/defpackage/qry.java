package defpackage;

import android.provider.MediaStore;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: qry  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qry {
    public final aplf a;
    public final qsx b;
    public final qri c;
    public final qrd d;
    private final Set e = new HashSet();
    private final List f = new ArrayList();
    private final Executor g;

    public qry(aplf aplf, Executor executor, qsx qsx, qrd qrd) {
        this.a = aplf;
        this.g = executor;
        this.b = qsx;
        this.d = qrd;
        qri qri = new qri(2);
        this.c = qri;
        qrd qrd2 = this.d;
        qri.c();
        qrd2.a(qri);
    }

    private final void b() {
        String str;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (qro qro : this.e) {
            Long l = qro.a;
            int intValue = qro.b.intValue();
            if (intValue == 0) {
                String uri = MediaStore.Files.getContentUri("external").toString();
                String valueOf = String.valueOf(l);
                StringBuilder sb = new StringBuilder(String.valueOf(uri).length() + 1 + String.valueOf(valueOf).length());
                sb.append(uri);
                sb.append("/");
                sb.append(valueOf);
                str = sb.toString();
            } else if (intValue == 1) {
                String valueOf2 = String.valueOf(MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                String valueOf3 = String.valueOf(l);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 1 + String.valueOf(valueOf3).length());
                sb2.append(valueOf2);
                sb2.append("/");
                sb2.append(valueOf3);
                str = sb2.toString();
            } else if (intValue != 2) {
                str = "";
            } else {
                String valueOf4 = String.valueOf(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI);
                String valueOf5 = String.valueOf(l);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf4).length() + 1 + String.valueOf(valueOf5).length());
                sb3.append(valueOf4);
                sb3.append("/");
                sb3.append(valueOf5);
                str = sb3.toString();
            }
            arrayList.add(str);
            arrayList2.add(qro.a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        acwa a2 = this.a.a(strArr);
        this.c.c(arrayList.size());
        this.e.clear();
        this.f.add(a(a2, arrayList2, strArr, true));
    }

    public final aorr a() {
        b();
        aorr a2 = aorl.a((Iterable) this.f);
        this.f.clear();
        return aopr.a(a2, (amqy) new qrv(this), this.g);
    }

    public final aorr a(acwa acwa, List list, String[] strArr, boolean z) {
        aosh f2 = aosh.f();
        acwa.a(this.g, (acvv) new qrw(this, list, f2));
        acwa.a(this.g, (acvs) new qrx(this, z, strArr, list, f2));
        return f2;
    }

    public final void a(qro qro) {
        this.e.add(qro);
        if (axvz.a.a().G() == ((long) this.e.size())) {
            b();
        }
    }
}
