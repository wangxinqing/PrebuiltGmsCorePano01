package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.smart_profile.card.view.BaseCardView;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: abja  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abja implements abir, abkd {
    private final avka a;
    private final Context b;
    private final abjz c;
    private final abke d;
    private final jtf e;

    public abja(Context context, BaseCardView baseCardView, avka avka, jtf jtf, Bundle bundle) {
        boolean z;
        boolean z2;
        String str;
        this.b = context;
        this.a = avka;
        this.e = jtf;
        this.c = new abjz(context, uj.b(context, R.drawable.group_divider));
        if (avka.b.size() == 0 && avka.a.size() == 0) {
            this.d = null;
            baseCardView.setVisibility(8);
            return;
        }
        if (this.a.a.size() != 0) {
            Context context2 = this.b;
            abjz abjz = new abjz(context2, R.string.profile_organizations_employment_header, 1, uj.b(context2, R.drawable.entry_divider));
            aucx aucx = this.a.a;
            int size = aucx.size();
            for (int i = 0; i < size; i++) {
                avjz avjz = (avjz) aucx.get(i);
                if (avjz.c.isEmpty() || avjz.a.isEmpty()) {
                    str = !avjz.c.isEmpty() ? avjz.c : avjz.a;
                } else {
                    str = this.b.getString(R.string.profile_employment_current_details, new Object[]{avjz.c, avjz.a});
                }
                abjz.a(a(str, a(avjz)));
            }
            this.c.a(abjz);
        }
        if (this.a.b.size() != 0) {
            Context context3 = this.b;
            abjz abjz2 = new abjz(context3, R.string.profile_organizations_education_header, 1, uj.b(context3, R.drawable.entry_divider));
            aucx aucx2 = this.a.b;
            int size2 = aucx2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                avjz avjz2 = (avjz) aucx2.get(i2);
                StringBuilder sb = new StringBuilder();
                if (!avjz2.a.isEmpty()) {
                    sb.append(avjz2.a);
                }
                if (!avjz2.c.isEmpty()) {
                    sb.append(" • ");
                    sb.append(avjz2.c);
                }
                if (!avjz2.b.isEmpty()) {
                    sb.append(", ");
                    sb.append(avjz2.b);
                }
                abjz2.a(a(sb.toString(), a(avjz2)));
            }
            this.c.a(abjz2);
        }
        if (bundle == null || !bundle.getBoolean("organizationsCardController")) {
            z = false;
        } else {
            z = true;
        }
        abjz abjz3 = this.c;
        if (avka.a.size() > 1 || avka.b.size() > 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.d = new abke(baseCardView, abjz3, this, z2, z);
    }

    private final abkf a(String str, String str2) {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.b).inflate(R.layout.organizations_entry, (ViewGroup) null);
        ((TextView) viewGroup.findViewById(R.id.text)).setText(str);
        if (!TextUtils.isEmpty(str2)) {
            ((TextView) viewGroup.findViewById(R.id.subtext)).setText(str2);
        } else {
            viewGroup.findViewById(R.id.subtext).setVisibility(8);
        }
        abkf abkf = new abkf(viewGroup);
        abkf.a(str);
        return abkf;
    }

    public final void b() {
        this.e.a(jth.SEE_LESS_BUTTON, jth.SMART_PROFILE_ORGANIZATIONS_CARD);
    }

    private static final String a(long j) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy", Locale.getDefault());
        simpleDateFormat.setTimeZone(jpp.a);
        return simpleDateFormat.format(new Date(j));
    }

    private final String a(avjz avjz) {
        if (avjz.h) {
            long j = avjz.d;
            if (j == 0) {
                return this.b.getString(R.string.organizations_present);
            }
            return this.b.getString(R.string.organizations_start_to_present, new Object[]{a(j)});
        }
        long j2 = avjz.d;
        if (j2 == 0 || avjz.f == 0) {
            long j3 = avjz.f;
            if (j3 != 0) {
                return a(j3);
            }
            return null;
        }
        return this.b.getString(R.string.organizations_start_to_end, new Object[]{a(j2), a(avjz.f)});
    }

    public final void a() {
        this.e.a(jth.SEE_MORE_BUTTON, jth.SMART_PROFILE_ORGANIZATIONS_CARD);
    }

    public final void a(Bundle bundle) {
        abke abke = this.d;
        if (abke != null) {
            bundle.putBoolean("organizationsCardController", abke.b);
        }
    }
}
