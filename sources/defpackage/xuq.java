package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.R;
import com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: xuq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xuq extends acg {
    public BackupAndSyncOptInState a;
    private final List e;
    private final Map f = new HashMap();
    private final Resources g;

    public xuq(Resources resources, List list) {
        this.g = resources;
        this.e = list;
        a(true);
    }

    public final int a() {
        return this.e.size();
    }

    public final int a(int i) {
        return ((Integer) this.e.get(i)).intValue();
    }

    public final adl a(ViewGroup viewGroup, int i) {
        return new xup(viewGroup);
    }

    /* access modifiers changed from: package-private */
    public final void a(int i, View.OnClickListener onClickListener) {
        this.f.put(Integer.valueOf(i), onClickListener);
    }

    public final void a(adl adl, int i) {
        xup xup = (xup) adl;
        if (a(i) == 1) {
            if (ayqr.e()) {
                xup.t.setImageDrawable(atg.a(this.g, R.drawable.ic_contacts_sync_96, (Resources.Theme) null));
                xup.t.setVisibility(0);
            } else {
                xup.t.setVisibility(8);
            }
            xup.u.setText(R.string.people_account_sync_card_title);
            xup.v.setText(R.string.people_contacts_sync_information_banner);
            xup.w.setText(R.string.people_sync_generic_card_button);
            xup.s.setOnClickListener((View.OnClickListener) this.f.get(1));
        } else if (a(i) == 2) {
            if (ayqr.e()) {
                xup.t.setImageDrawable(atg.a(this.g, R.drawable.ic_contacts_backup_sync_96, (Resources.Theme) null));
                xup.t.setVisibility(0);
            } else {
                xup.t.setVisibility(8);
            }
            xup.u.setText(R.string.people_backup_sync_text);
            if (xus.a(this.a)) {
                xup.v.setText(this.g.getString(R.string.people_backup_sync_card_body_toggle_on, new Object[]{this.a.a}));
            } else {
                xup.v.setText(R.string.people_backup_sync_card_body_toggle_off);
            }
            xup.w.setText(R.string.people_sync_generic_card_button);
            xup.s.setOnClickListener((View.OnClickListener) this.f.get(2));
        }
    }
}
