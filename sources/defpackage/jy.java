package defpackage;

import android.view.ViewGroup;
import com.google.android.gms.R;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: jy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jy {
    final ArrayList a = new ArrayList();
    final HashMap b = new HashMap();

    jy() {
    }

    static jy a(ViewGroup viewGroup, hl hlVar) {
        hlVar.q();
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof jy) {
            return (jy) tag;
        }
        jy jyVar = new jy((byte[]) null);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, jyVar);
        return jyVar;
    }

    public jy(byte[] bArr) {
        new HashMap();
    }

    public final void a(hq hqVar, mo moVar) {
        if (!moVar.a()) {
            synchronized (this.a) {
                mo moVar2 = new mo();
                jx jxVar = new jx(hqVar);
                this.a.add(jxVar);
                this.b.put(jxVar.a, jxVar);
                moVar.a(new jv(this, jxVar, moVar2));
                jxVar.b.add(new jw(this, jxVar));
            }
        }
    }
}
