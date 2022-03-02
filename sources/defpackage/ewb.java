package defpackage;

import com.google.android.chimera.Fragment;
import com.google.android.gms.R;

/* renamed from: ewb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ewb implements ax {
    private final ewd a;

    public ewb(ewd ewd) {
        this.a = ewd;
    }

    public final void a(Object obj) {
        Fragment fragment;
        ewd ewd = this.a;
        int intValue = ((Integer) obj).intValue();
        anaf anaf = ewd.a;
        Integer valueOf = Integer.valueOf(intValue);
        amrl.a(anaf.containsKey(valueOf), "Unrecognized UI Type: %s", intValue);
        String str = (String) ewd.a.get(valueOf);
        if (ewd.getChildFragmentManager().findFragmentByTag(str) == null) {
            if (intValue == 1) {
                fragment = new exj();
            } else if (intValue == 2) {
                fragment = new ext();
            } else {
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unrecognized UI Type: ");
                sb.append(intValue);
                throw new IllegalArgumentException(sb.toString());
            }
            ewd.getChildFragmentManager().beginTransaction().replace(R.id.google_sign_in_container, fragment, str).commitNow();
        }
    }
}
