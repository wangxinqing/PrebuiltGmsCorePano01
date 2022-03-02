package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.R;
import com.google.android.gms.romanesco.restoresettings.ContactsRestoreSettingsChimeraActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: zxg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zxg extends acg {
    public final ContactsRestoreSettingsChimeraActivity a;
    public String e;
    public String f;
    public final List g = new ArrayList();
    public boolean h;

    public zxg(ContactsRestoreSettingsChimeraActivity contactsRestoreSettingsChimeraActivity) {
        zsg.a("CRSAdapter");
        this.a = contactsRestoreSettingsChimeraActivity;
    }

    public final int a() {
        if (TextUtils.isEmpty(this.e)) {
            return 1;
        }
        if (!this.g.isEmpty()) {
            return this.g.size() + 4;
        }
        return 5;
    }

    public final int a(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 4;
        }
        if (i == 2) {
            return 5;
        }
        if (i != 3) {
            return (i != 4 || !this.g.isEmpty()) ? 0 : 3;
        }
        return 2;
    }

    public final adl a(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2;
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 2 || i == 4) {
            return new zxf(from.inflate(R.layout.romanesco_contacts_restore_settings_text, viewGroup, false));
        }
        View inflate = from.inflate(R.layout.common_settings_item, viewGroup, false);
        if (i == 3 || i == 5) {
            return new zxd(this, inflate);
        }
        zxe zxe = new zxe(this, inflate);
        if (i == 1 && (viewGroup2 = (ViewGroup) inflate.findViewById(16908312)) != null) {
            viewGroup2.addView(from.inflate(R.layout.romanesco_account_selection_dropdown, viewGroup2, false));
            viewGroup2.setVisibility(0);
        }
        return zxe;
    }

    public final void a(adl adl, int i) {
        String str;
        Long l;
        if (i == 0) {
            zxe zxe = (zxe) adl;
            zxe.s.setText(R.string.romanesco_from_account);
            if (TextUtils.isEmpty(this.e)) {
                zxe.t.setText(R.string.romanesco_no_account);
            } else {
                zxe.t.setText(this.e);
            }
        } else if (i == 1) {
            ((zxf) adl).s.setText(R.string.romanesco_google_contacts_settings_title);
        } else if (i == 2) {
            ((zxd) adl).t.setText(R.string.romanesco_google_contacts_settings_summary);
        } else if (i == 3) {
            ((zxf) adl).s.setText(R.string.romanesco_title_has_backup);
        } else if (i == 4 && this.g.isEmpty()) {
            zxd zxd = (zxd) adl;
            if (this.h || TextUtils.isEmpty(this.e)) {
                zxd.t.setText("");
            } else {
                zxd.t.setText(R.string.romanesco_contacts_device_section_title_no_backup);
            }
        } else {
            zxe zxe2 = (zxe) adl;
            zyi zyi = (zyi) this.g.get(i - 4);
            zxe2.s.setText(zyi.k);
            int i2 = zyi.d;
            if (!azfh.c() || !zyi.a()) {
                Resources resources = this.a.getResources();
                Integer valueOf = Integer.valueOf(i2);
                str = resources.getString(R.string.romanesco_contacts_count, new Object[]{valueOf, valueOf});
            } else if (zyi.a(zyi.l)) {
                str = this.a.getResources().getString(R.string.romanesco_encrypted_gms_contacts_description);
            } else {
                str = this.a.getResources().getString(R.string.romanesco_gms_contacts_description);
            }
            if (zyi.a() || azfh.e()) {
                String str2 = this.e;
                String a2 = zyk.a(zyi);
                ContactsRestoreSettingsChimeraActivity contactsRestoreSettingsChimeraActivity = this.a;
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 14 + String.valueOf(a2).length());
                sb.append("restore_time__");
                sb.append(str2);
                sb.append(a2);
                l = Long.valueOf(zyk.b(contactsRestoreSettingsChimeraActivity.getApplicationContext()).getLong(sb.toString(), 0));
            } else {
                l = Long.valueOf(zyi.m);
            }
            if (l.longValue() > 0) {
                String b = zyk.b(this.a, l.longValue());
                String valueOf2 = String.valueOf(str);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 1 + String.valueOf(b).length());
                sb2.append(valueOf2);
                sb2.append("\n");
                sb2.append(b);
                str = sb2.toString();
            } else {
                long j = zyi.c;
                if (j > 0) {
                    String a3 = zyk.a((Context) this.a, j);
                    String valueOf3 = String.valueOf(str);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 1 + String.valueOf(a3).length());
                    sb3.append(valueOf3);
                    sb3.append("\n");
                    sb3.append(a3);
                    str = sb3.toString();
                }
            }
            zxe2.t.setText(str);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(String str) {
        TextUtils.isEmpty(str);
        this.f = str;
    }
}
