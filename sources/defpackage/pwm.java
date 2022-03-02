package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.google.android.gms.R;
import com.google.android.gms.search.administration.AppIndexingUserActionInfo;

/* renamed from: pwm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class pwm implements AdapterView.OnItemClickListener {
    final /* synthetic */ pwn a;

    public pwm(pwn pwn) {
        this.a = pwn;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        pwg pwg = this.a.a;
        if (pwg != null && i >= 0 && i < pwg.getCount()) {
            AppIndexingUserActionInfo a2 = this.a.a.getItem(i);
            pwn pwn = this.a;
            pwi pwi = new pwi();
            Bundle bundle = new Bundle();
            bundle.putParcelable("userAction", a2);
            pwi.setArguments(bundle);
            pwn.getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.debug_container, pwi, "userActionDetailsFragment").addToBackStack((String) null).commit();
        }
    }
}
