package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.widget.TextView;
import com.google.android.gms.R;

/* renamed from: msy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class msy implements arxa {
    final /* synthetic */ mta a;

    public msy(mta mta) {
        this.a = mta;
    }

    public final void a() {
        int i;
        String str;
        arxb arxb;
        ((anih) ((anih) mte.a.d()).a("msy", "a", 98, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("DeviceDetail: Service is connected");
        mta mta = this.a;
        if (!mta.e() && (arxb = mta.i) != null) {
            try {
                mta.c = arxb.a(mta.b);
            } catch (RemoteException e) {
                anih anih = (anih) mte.a.c();
                anih.a((Throwable) e);
                ((anih) anih.a("mta", "a", 195, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("DeviceDetail: Get address from account key fail.");
            }
        }
        if (mta.h == null && mta.getView() != null) {
            RecyclerView recyclerView = (RecyclerView) mta.getView().findViewById(R.id.sliceDetailsLink);
            mta.getContext();
            recyclerView.setLayoutManager(new abk());
            Context context = mta.getContext();
            aoe aoe = mta.a;
            Uri.Builder appendPath = new Uri.Builder().scheme("content").authority("com.google.android.gms.nearby.fastpair").appendPath("links");
            if (mta.e()) {
                appendPath.appendQueryParameter("address", mta.c);
            } else if (mta.b != null) {
                appendPath.appendQueryParameter("account_key", anml.g.a(mta.b));
            }
            mta.h = new mrh(context, aoe, appendPath.build());
            recyclerView.setAdapter(mta.h);
        }
        MenuItem menuItem = mta.d;
        if (menuItem != null) {
            menuItem.setVisible(mta.e());
        }
        mta.b();
        TextView textView = mta.g;
        if (textView != null) {
            if (!mta.e()) {
                i = 8;
            } else {
                i = 0;
            }
            textView.setVisibility(i);
            TextView textView2 = mta.g;
            if (mta.e()) {
                str = mta.getString(R.string.fast_pair_device_details_footer_address, mta.c);
            } else {
                str = "";
            }
            textView2.setText(str);
        }
        mta.c();
    }

    public final void b() {
        ((anih) ((anih) mte.a.d()).a("msy", "b", 104, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("DeviceDetail: Service is disconnected");
    }
}
