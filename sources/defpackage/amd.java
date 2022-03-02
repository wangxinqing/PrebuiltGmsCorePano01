package defpackage;

import android.content.Context;
import android.text.TextUtils;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import com.google.android.gms.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: amd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amd extends Preference {
    public long a;

    public amd(Context context, List list, long j) {
        super(context);
        this.B = R.layout.expand_button;
        a(uj.b(this.k, R.drawable.ic_arrow_down_24dp));
        this.s = R.drawable.ic_arrow_down_24dp;
        b((int) R.string.expand_button_title);
        a(999);
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        CharSequence charSequence = null;
        for (int i = 0; i < size; i++) {
            Preference preference = (Preference) list.get(i);
            CharSequence charSequence2 = preference.r;
            boolean z = preference instanceof PreferenceGroup;
            if (z && !TextUtils.isEmpty(charSequence2)) {
                arrayList.add((PreferenceGroup) preference);
            }
            if (!arrayList.contains(preference.E)) {
                if (!TextUtils.isEmpty(charSequence2)) {
                    if (charSequence != null) {
                        charSequence = this.k.getString(R.string.summary_collapsed_preference_list, new Object[]{charSequence, charSequence2});
                    } else {
                        charSequence = charSequence2;
                    }
                }
            } else if (z) {
                arrayList.add((PreferenceGroup) preference);
            }
        }
        a(charSequence);
        this.a = j + 1000000;
    }

    public final void a(anb anb) {
        super.a(anb);
        anb.u = false;
    }

    public final long e() {
        return this.a;
    }
}
