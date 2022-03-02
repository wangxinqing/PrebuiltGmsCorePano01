package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Looper;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;

/* renamed from: ewj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ewj extends qcg {
    public View a;
    public TextView b;
    public TextView c;
    public TextView d;
    public AccountParticleDisc e;
    public eyf f;
    public fcq g;
    public fcp h;
    public CountDownTimer i;
    public fgr j;
    public long k;

    public final void a() {
        CountDownTimer countDownTimer = this.i;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Activity activity = getActivity();
        this.g = (fcq) qck.a(activity).a(fcq.class);
        this.f = (eyf) qck.a(activity).a(eyf.class);
        qaq qaq = new qaq(new qvr(Looper.getMainLooper()));
        aoru a2 = jfm.a(9);
        agcf agcf = new agcf(qaq);
        this.e.a((agbv) agcf, fcp.class);
        fct fct = new fct(this.f.d);
        AccountParticleDisc.a(getContext(), agcf, a2, fct, fct, fcp.class);
        this.f.i.a(this, new ewe(this));
        this.a.getViewTreeObserver().addOnGlobalLayoutListener(new ewi(this));
        this.j = new fgr(this, this.f.g, (hol) null);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.cloneInContext(new vt((Context) getActivity(), (int) R.style.AppBottomSheetDialogTheme)).inflate(R.layout.credentials_assisted_signin_confirmation, viewGroup, false);
        this.a = inflate.findViewById(R.id.confirmation_container);
        this.b = (TextView) inflate.findViewById(R.id.header_text);
        this.e = (AccountParticleDisc) inflate.findViewById(R.id.account_particle_disc);
        this.c = (TextView) inflate.findViewById(R.id.account_display_name);
        this.d = (TextView) inflate.findViewById(R.id.account_name);
        inflate.findViewById(R.id.cancel_signin_button).setOnClickListener(new ewg(this));
        return inflate;
    }

    public final void onPause() {
        a();
        super.onPause();
    }

    public final void onResume() {
        super.onResume();
        this.k = SystemClock.elapsedRealtime();
        this.f.l.a(this, new ewf(this));
    }
}
