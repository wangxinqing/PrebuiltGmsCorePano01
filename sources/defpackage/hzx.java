package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;

/* renamed from: hzx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hzx extends adl {
    final TextView s;
    final TextView t;
    final AccountParticleDisc u;
    final View v;

    public hzx(View view, agcf agcf) {
        super(view);
        this.s = (TextView) view.findViewById(R.id.account_display_name);
        this.t = (TextView) view.findViewById(R.id.account_name);
        ImageView imageView = (ImageView) view.findViewById(R.id.account_profile_picture);
        AccountParticleDisc accountParticleDisc = (AccountParticleDisc) view.findViewById(R.id.account_particle_disc);
        this.u = accountParticleDisc;
        accountParticleDisc.a((agbv) agcf, pzh.class);
        this.v = view.findViewById(R.id.container);
    }
}
