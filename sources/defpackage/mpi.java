package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.R;
import com.google.android.gms.family.v2.model.PageData;
import java.lang.ref.WeakReference;

/* renamed from: mpi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class mpi implements LoaderManager.LoaderCallbacks {
    final /* synthetic */ mpj a;

    public mpi(mpj mpj) {
        this.a = mpj;
    }

    private final void a() {
        Dialog a2 = mfu.a(this.a.getActivity(), new mpg(this), new mph(this));
        if (this.a.c.get() == null) {
            this.a.c = new WeakReference(a2);
            a2.show();
        }
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        String string = this.a.getArguments().getString("memberId");
        return new mpo(this.a.getActivity(), this.a.getArguments().getString("accountName"), this.a.a.m(), this.a.a.e(), string == null ? 12 : 11, string);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        mhg mhg = (mhg) obj;
        if (!mhg.b) {
            a();
            return;
        }
        Object obj2 = mhg.a;
        if (obj2 == null || (((apjh) obj2).a & 2) == 0) {
            a();
            return;
        }
        mpj mpj = this.a;
        View view = mpj.b;
        if (view != null) {
            view.findViewById(R.id.fm_management_loading_screen).setVisibility(8);
            mpj.b.findViewById(R.id.fm_management_content_screen).setVisibility(0);
        }
        mpj mpj2 = this.a;
        apkp apkp = ((apjh) mhg.a).c;
        if (apkp == null) {
            apkp = apkp.e;
        }
        PageData pageData = new PageData(apkp);
        String string = mpj2.getArguments().getString("accountName");
        if (pageData.a.containsKey(28)) {
            mgj.a((Toolbar) mpj2.b.findViewById(R.id.fm_toolbar), (String) pageData.a.get(28), mpj2.getActivity());
        }
        if (pageData.a.containsKey(3)) {
            mgh.a((TextView) mpj2.b.findViewById(R.id.fm_management_body_text), (String) pageData.a.get(3), new mgb(pageData, mpj2, string));
        }
        Button button = (Button) mpj2.b.findViewById(R.id.fm_management_action_button);
        if (pageData.a.containsKey(4)) {
            String str = (String) pageData.a.get(4);
            if (str.isEmpty()) {
                button.setVisibility(8);
            } else {
                button.setText(str);
            }
        }
        button.setOnClickListener(new mpd(mpj2));
        Button button2 = (Button) mpj2.b.findViewById(R.id.fm_management_cancel_button);
        if (pageData.a.containsKey(5)) {
            button2.setText((CharSequence) pageData.a.get(5));
        }
        button2.setOnClickListener(new mpe(mpj2));
    }

    public final void onLoaderReset(Loader loader) {
    }
}
