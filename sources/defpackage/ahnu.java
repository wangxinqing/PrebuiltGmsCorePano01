package defpackage;

import androidx.preference.ListPreference;
import com.google.android.gms.R;

/* renamed from: ahnu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahnu extends bso {
    public ListPreference c;
    public ahnt d;

    public final void d() {
        a((int) R.xml.pref_interruption_filter);
        ListPreference listPreference = (ListPreference) a((CharSequence) "interruption_setting");
        this.c = listPreference;
        listPreference.a((CharSequence) listPreference.j);
        this.c.o = new ahns(this);
    }
}
