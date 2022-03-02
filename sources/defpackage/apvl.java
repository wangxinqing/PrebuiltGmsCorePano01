package defpackage;

import android.text.TextUtils;
import com.google.firebase.auth.api.model.MfaInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: apvl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apvl implements apth {
    public String a;
    public String b;
    public long c;
    public List d;
    public String e;

    public final auef a() {
        return (auef) alnc.j.c(7);
    }

    public final boolean b() {
        return !TextUtils.isEmpty(this.e);
    }

    public final /* bridge */ /* synthetic */ void a(audx audx) {
        if (audx instanceof alnc) {
            alnc alnc = (alnc) audx;
            jlh.b(alnc.a);
            jlh.b(alnc.b);
            jlh.b(alnc.c);
            this.a = jlh.b(alnc.d);
            jlh.b(alnc.e);
            this.b = jlh.b(alnc.f);
            this.c = alnc.g;
            this.d = new ArrayList();
            aucx aucx = alnc.i;
            int size = aucx.size();
            for (int i = 0; i < size; i++) {
                this.d.add(MfaInfo.a((alnh) aucx.get(i)));
            }
            this.e = alnc.h;
            return;
        }
        throw new IllegalArgumentException("The passed proto must be an instance of VerifyPasswordResponse.");
    }
}
