package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: hyo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class hyo extends ArrayAdapter {
    protected final LayoutInflater a;
    public final Map b;
    public int c = -1;
    public int d;
    private final List e;
    private agcf f;
    private hyh g;
    private iby h;
    private iby i;

    public final View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        return getView(i2, view, viewGroup);
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        hyn hyn;
        if (view == null) {
            view = this.a.inflate(R.layout.common_account_chip_with_disc_row, viewGroup, false);
            hyn = new hyn();
            hyn.a = (TextView) view.findViewById(R.id.account_name);
            hyn.b = (TextView) view.findViewById(R.id.account_display_name);
            hyn.c = (AccountParticleDisc) view.findViewById(R.id.account_particle_disc);
            hyn.c.a((agbv) this.f, hym.class);
            view.setTag(hyn);
        } else {
            hyn = (hyn) view.getTag();
        }
        Account account = (Account) this.e.get(i2);
        hyn.a.setText(account.name);
        hyk hyk = (hyk) this.b.get(account.name);
        if (hyk != null) {
            hyn.b.setText(hyk.a);
            Bitmap bitmap = hyk.b;
            if (bitmap == null) {
                hyn.c.a((Object) new hym(this, account.name));
            } else if (bitmap != hyn.d) {
                hyn.d = bitmap;
                hyn.c.a((Object) new hym(this, account.name));
            }
        }
        if (i2 == this.c) {
            view.setBackgroundColor(-7829368);
        }
        return view;
    }

    public hyo(Context context, List list) {
        super(context, 17367055, list);
        this.g = new hyh(context);
        this.d = context.getResources().getDimensionPixelSize(iag.a(this.g.a, R.attr.common_account_chip_avatar_image_size, R.dimen.common_account_chip_avatar_size));
        this.b = Collections.synchronizedMap(new HashMap());
        iva.b(!list.contains((Object) null));
        this.e = list;
        this.a = LayoutInflater.from(context);
        wlr wlr = new wlr();
        wlr.a = 80;
        wls a2 = wlr.a();
        iby d2 = wlt.d(context, a2);
        iby a3 = wlt.a(context, a2);
        this.i = d2;
        this.h = a3;
        qaq qaq = new qaq(new qvr(Looper.getMainLooper()));
        aoru a4 = jfm.a(9);
        this.f = new agcf(qaq);
        hyl hyl = new hyl();
        AccountParticleDisc.a(getContext(), this.f, a4, hyl, hyl, hym.class);
        ArrayList arrayList = new ArrayList(this.e.size() + 1);
        iby iby = this.i;
        wkz wkz = new wkz();
        wkz.b = false;
        aorr a5 = qbc.a(iby.a(wkz));
        aorl.a(a5, new hyi(this), qaq);
        arrayList.add(a5);
        List list2 = this.e;
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            Account account = (Account) list2.get(i2);
            aorr a6 = qbc.a(this.h.a(account.name, 1, 1));
            aorl.a(a6, new hyj(this, account), qaq);
            arrayList.add(a6);
        }
        aorl.b((Iterable) arrayList).a((Runnable) new hyg(this), (Executor) qaq);
    }
}
