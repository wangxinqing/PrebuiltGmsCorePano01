package defpackage;

import com.google.android.gms.smart_profile.SmartProfilePerson;

/* renamed from: abfu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abfu implements abma {
    final /* synthetic */ abfv a;

    public abfu(abfv abfv) {
        this.a = abfv;
    }

    public final void a(SmartProfilePerson smartProfilePerson) {
        abfv abfv = this.a;
        abft abft = new abft(abfv, smartProfilePerson, abfv.a);
        this.a.setListAdapter(abft);
        abft.notifyDataSetChanged();
    }
}
