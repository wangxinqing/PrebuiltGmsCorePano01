package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.gms.R;
import com.google.android.gms.nearby.sharing.ContactSelectChimeraActivity;

/* renamed from: vus  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vus extends vue {
    public int g = 0;
    private final viw h;

    public vus(Context context, viw viw) {
        super(context, viw);
        this.h = viw;
    }

    public final void g(int i) {
        this.g = i;
        as();
        viw viw = this.h;
        int i2 = this.g;
        int i3 = 2;
        if (i2 != 1) {
            i3 = i2 != 2 ? 1 : 0;
        }
        viw.a.i.a(i3);
        if (i3 != 0) {
            ContactSelectChimeraActivity contactSelectChimeraActivity = viw.a;
            if (i3 != 1) {
                contactSelectChimeraActivity.g.b(true);
            } else {
                contactSelectChimeraActivity.g.b(false);
            }
            ContactSelectChimeraActivity contactSelectChimeraActivity2 = viw.a;
            if (ayni.C()) {
                acwa b = contactSelectChimeraActivity2.f().t().b(new vip(contactSelectChimeraActivity2));
                b.a((acvv) new viq(contactSelectChimeraActivity2));
                b.a((acvs) new vir(contactSelectChimeraActivity2));
            }
        }
        viw.a.a(i3);
    }

    public final /* bridge */ /* synthetic */ adl a(ViewGroup viewGroup, int i) {
        return new vur(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sharing_list_item_visibility, viewGroup, false));
    }
}
