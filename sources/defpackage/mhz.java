package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;
import com.google.android.gms.R;
import com.google.android.gms.family.v2.model.BirthdayData;
import com.google.android.gms.family.v2.model.PageData;
import com.google.android.gms.family.widget.DateSpinner;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* renamed from: mhz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mhz extends DialogFragment implements mfz {
    public mhy a;
    public Calendar b;
    private String c;
    private PageData d;
    private PageData e;
    private View f;
    private int g;

    public static final int a(Calendar calendar) {
        if (calendar == null) {
            return -1;
        }
        Calendar instance = GregorianCalendar.getInstance();
        int i = instance.get(1) - calendar.get(1);
        return calendar.get(6) <= instance.get(6) ? i : i - 1;
    }

    public final void b() {
        if (this.f != null) {
            this.g = 2;
            int a2 = a(this.b);
            this.f.findViewById(R.id.fm_birthday_buttons).setVisibility(8);
            this.f.findViewById(R.id.fm_birthday_confirm_buttons).setVisibility(0);
            if (this.e.a.containsKey(2)) {
                mgh.a((TextView) this.f.findViewById(R.id.fm_birthday_header_text), (String) this.e.a.get(2), new mgb(this.e, this, this.c));
            }
            ((TextView) this.f.findViewById(R.id.fm_birthday_body_text)).setText(getResources().getQuantityString(R.plurals.fm_age_confirmation, a2, new Object[]{Integer.valueOf(a2)}));
            ((DateSpinner) this.f.findViewById(R.id.fm_birthday_date_spinner)).setVisibility(8);
            Button button = (Button) this.f.findViewById(R.id.fm_birthday_confirm_continue_button);
            if (this.e.a.containsKey(4)) {
                button.setText((CharSequence) this.e.a.get(4));
            }
            button.setEnabled(true);
            button.setOnClickListener(new mhw(this));
            Button button2 = (Button) this.f.findViewById(R.id.fm_birthday_confirm_cancel_button);
            if (this.e.a.containsKey(5)) {
                button2.setText((CharSequence) this.e.a.get(5));
            }
            button2.setOnClickListener(new mhx(this));
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.a = (mhy) mfy.a(mhy.class, activity);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x005a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            super.onCreate(r5)
            android.os.Bundle r0 = r4.getArguments()
            java.lang.String r1 = "birthdayPageData"
            android.os.Parcelable r0 = r0.getParcelable(r1)
            com.google.android.gms.family.v2.model.PageData r0 = (com.google.android.gms.family.v2.model.PageData) r0
            r4.d = r0
            android.os.Bundle r0 = r4.getArguments()
            java.lang.String r1 = "confirmPageData"
            android.os.Parcelable r0 = r0.getParcelable(r1)
            com.google.android.gms.family.v2.model.PageData r0 = (com.google.android.gms.family.v2.model.PageData) r0
            r4.e = r0
            android.os.Bundle r0 = r4.getArguments()
            java.lang.String r1 = "accountName"
            java.lang.String r0 = r0.getString(r1)
            r4.c = r0
            r0 = 1
            if (r5 == 0) goto L_0x0064
            java.lang.String r1 = "state"
            java.lang.String r1 = r5.getString(r1)
            int r2 = r1.hashCode()
            r3 = 66130002(0x3f11052, float:1.4168454E-36)
            if (r2 == r3) goto L_0x004d
            r3 = 1669100192(0x637c72a0, float:4.656839E21)
            if (r2 == r3) goto L_0x0043
            goto L_0x0057
        L_0x0043:
            java.lang.String r2 = "CONFIRM"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0057
            r1 = 1
            goto L_0x0058
        L_0x004d:
            java.lang.String r2 = "ENTRY"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0057
            r1 = 0
            goto L_0x0058
        L_0x0057:
            r1 = -1
        L_0x0058:
            if (r1 == 0) goto L_0x0064
            if (r1 != r0) goto L_0x005e
            r0 = 2
            goto L_0x0065
        L_0x005e:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>()
            throw r5
        L_0x0064:
        L_0x0065:
            r4.g = r0
            if (r5 == 0) goto L_0x0072
            java.lang.String r0 = "birthday"
            java.io.Serializable r5 = r5.getSerializable(r0)
            java.util.Calendar r5 = (java.util.Calendar) r5
            goto L_0x0073
        L_0x0072:
            r5 = 0
        L_0x0073:
            r4.b = r5
            mhy r5 = r4.a
            mhi r5 = r5.b()
            r0 = 12
            r5.b(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mhz.onCreate(android.os.Bundle):void");
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.getWindow().requestFeature(1);
        return onCreateDialog;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f = layoutInflater.inflate(R.layout.fm_fragment_birthday_dialog, viewGroup, false);
        int i = this.g;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 0) {
                a();
            } else if (i2 == 1) {
                b();
            }
            return this.f;
        }
        throw null;
    }

    public final void onDetach() {
        super.onDetach();
        this.a = null;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        int i = this.g;
        String str = i != 1 ? i != 2 ? "null" : "CONFIRM" : "ENTRY";
        if (i != 0) {
            bundle.putString("state", str);
            bundle.putSerializable("birthday", this.b);
            return;
        }
        throw null;
    }

    public final void a() {
        boolean z;
        View view = this.f;
        if (view != null) {
            this.g = 1;
            view.findViewById(R.id.fm_birthday_confirm_buttons).setVisibility(8);
            this.f.findViewById(R.id.fm_birthday_buttons).setVisibility(0);
            if (this.d.a.containsKey(2)) {
                mgh.a((TextView) this.f.findViewById(R.id.fm_birthday_header_text), (String) this.d.a.get(2), new mgb(this.d, this, this.c));
            }
            if (this.d.a.containsKey(3)) {
                mgh.a((TextView) this.f.findViewById(R.id.fm_birthday_body_text), (String) this.d.a.get(3), new mgb(this.d, this, this.c));
            }
            Button button = (Button) this.f.findViewById(R.id.fm_birthday_continue_button);
            if (this.d.a.containsKey(4)) {
                button.setText((CharSequence) this.d.a.get(4));
            }
            if (this.b != null) {
                z = true;
            } else {
                z = false;
            }
            button.setEnabled(z);
            button.setOnClickListener(new mht(this));
            DateSpinner dateSpinner = (DateSpinner) this.f.findViewById(R.id.fm_birthday_date_spinner);
            dateSpinner.setVisibility(0);
            String str = (String) this.d.a.get(8);
            String str2 = (String) this.d.a.get(9);
            String str3 = (String) this.d.a.get(10);
            dateSpinner.a = str;
            dateSpinner.b = str2;
            dateSpinner.c = str3;
            ((mra) ((Spinner) dateSpinner.findViewById(R.id.fm_birthday_month)).getAdapter()).a = str;
            ((mrb) ((Spinner) dateSpinner.findViewById(R.id.fm_birthday_day)).getAdapter()).a = str2;
            ((EditText) dateSpinner.findViewById(R.id.fm_birthday_year)).setHint(str3);
            BirthdayData birthdayData = (BirthdayData) getArguments().getParcelable("birthday");
            if (birthdayData != null) {
                dateSpinner.b(birthdayData.a);
                dateSpinner.a(birthdayData.b);
            }
            Calendar calendar = this.b;
            if (calendar != null) {
                dateSpinner.b(calendar.get(2));
                dateSpinner.a(this.b.get(5));
                ((EditText) dateSpinner.findViewById(R.id.fm_birthday_year)).setText(String.valueOf(this.b.get(1)));
            }
            dateSpinner.d = new mhu(this, button);
            Button button2 = (Button) this.f.findViewById(R.id.fm_birthday_cancel_button);
            if (this.d.a.containsKey(5)) {
                button2.setText((CharSequence) this.d.a.get(5));
            }
            button2.setOnClickListener(new mhv(this));
        }
    }
}
