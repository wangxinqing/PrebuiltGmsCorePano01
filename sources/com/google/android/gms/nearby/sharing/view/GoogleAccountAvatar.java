package com.google.android.gms.nearby.sharing.view;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GoogleAccountAvatar extends AccountParticleDisc {
    public GoogleAccountAvatar(Context context) {
        super(context);
        a(context);
    }

    private final void a(Context context) {
        jfz jfz = new jfz(1, 9);
        agcf agcf = new agcf(jfz);
        a((agbv) agcf, agbl.class);
        Context applicationContext = context.getApplicationContext();
        agbm agbm = new agbm();
        Context applicationContext2 = context.getApplicationContext();
        wlr wlr = new wlr();
        wlr.a = 80;
        AccountParticleDisc.a(applicationContext, agcf, jfz, agbm, new agbo(applicationContext2, jfz, wlr.a()), agbl.class);
    }

    public GoogleAccountAvatar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public GoogleAccountAvatar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }
}
