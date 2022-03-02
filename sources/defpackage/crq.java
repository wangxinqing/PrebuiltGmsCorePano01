package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: crq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class crq extends ArrayAdapter {
    protected final LayoutInflater a;
    public final Map b;
    public int c;
    private final List d;
    private int e = -1;
    private iby f;
    private iby g;

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return getView(i, view, viewGroup);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        crp crp;
        if (view == null) {
            view = this.a.inflate(R.layout.common_account_chip_view, viewGroup, false);
            crp = new crp();
            crp.a = (TextView) view.findViewById(R.id.account_name);
            crp.b = (TextView) view.findViewById(R.id.account_display_name);
            crp.c = (ImageView) view.findViewById(R.id.account_profile_picture);
            view.setTag(crp);
        } else {
            crp = (crp) view.getTag();
        }
        Account account = (Account) this.d.get(i);
        crp.a.setText(account.name);
        cro cro = (cro) this.b.get(account.name);
        if (cro != null) {
            crp.b.setText(cro.a);
            Bitmap bitmap = cro.b;
            if (bitmap == null) {
                crp.c.setImageBitmap((Bitmap) null);
            } else if (bitmap != crp.d) {
                crp.d = bitmap;
                crp.c.setImageBitmap(bitmap);
            }
        }
        if (i == this.e) {
            view.setBackgroundColor(-7829368);
        }
        return view;
    }

    public crq(Context context, List list) {
        super(context, 17367055, list);
        this.c = context.getResources().getDimensionPixelSize(R.dimen.common_account_chip_avatar_size);
        this.b = Collections.synchronizedMap(new HashMap());
        iva.b(!list.contains((Object) null));
        this.d = list;
        this.a = LayoutInflater.from(context);
        wlr wlr = new wlr();
        wlr.a = 80;
        wls a2 = wlr.a();
        iby d2 = wlt.d(context, a2);
        iby a3 = wlt.a(context, a2);
        this.g = d2;
        this.f = a3;
        qaq qaq = new qaq(new qvr(Looper.getMainLooper()));
        ArrayList arrayList = new ArrayList(this.d.size() + 1);
        iby iby = this.g;
        wkz wkz = new wkz();
        wkz.b = false;
        aorr a4 = qbc.a(iby.a(wkz));
        aorl.a(a4, new crm(this), qaq);
        arrayList.add(a4);
        List list2 = this.d;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            Account account = (Account) list2.get(i);
            aorr a5 = qbc.a(this.f.a(account.name, 1, 0));
            aorl.a(a5, new crn(this, account), qaq);
            arrayList.add(a5);
        }
        aorl.b((Iterable) arrayList).a((aoqa) new crl(this), (Executor) qaq);
    }
}
