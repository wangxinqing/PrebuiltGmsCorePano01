package defpackage;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.auth.CallingAppInfo;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

/* renamed from: loj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class loj extends lny {
    public static final ith a = new ith("CreateFileDialogFragmen", "");
    public DriveId b;
    public MetadataBundle c;
    public int d;
    public int e;
    public String f;
    public String g;
    public String h;
    public icc i;
    public EditText j;
    public boolean k;
    private Button l;
    private TextView m;
    private lfs n;
    private Bundle o;

    public final void a() {
        this.m.setOnClickListener(new log(this));
        DriveId driveId = this.b;
        if (driveId != null) {
            driveId.b().a(this.i).a((icm) new loh(this));
        } else {
            a((jzr) null);
        }
        this.l.setEnabled(true);
    }

    public final void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 != 0) {
            super.onActivityResult(i2, i3, intent);
        } else if (i3 == -1) {
            this.b = (DriveId) intent.getParcelableExtra("response_drive_id");
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.k = false;
        this.f = getArguments().getString("accountName");
        this.g = getArguments().getString("callerSdkAppId");
        this.h = getArguments().getString("callerPackageName");
        if (bundle == null) {
            bundle = getArguments();
        }
        this.b = (DriveId) bundle.getParcelable("selectedCollectionDriveId");
        this.c = (MetadataBundle) bundle.getParcelable("metadata");
        this.d = bundle.getInt("requestId");
        this.e = bundle.getInt("fileType", 0);
        this.o = bundle.getBundle("logSessionState");
        if (this.c == null) {
            MetadataBundle a2 = MetadataBundle.a();
            this.c = a2;
            a2.b(lce.Q, getResources().getString(R.string.drive_create_file_default_title));
            this.c.b(lce.N, "application/octet-stream");
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.drive_create_file_dialog, (ViewGroup) null);
        EditText editText = (EditText) inflate.findViewById(R.id.drive_create_file_dialog_edittext_document_title);
        this.j = editText;
        editText.setText((CharSequence) this.c.a((kyq) lce.Q));
        ((TextView) inflate.findViewById(R.id.drive_create_file_dialog_account_name)).setText(this.f);
        this.m = (TextView) inflate.findViewById(R.id.drive_create_file_dialog_folder_selector);
        this.l = (Button) inflate.findViewById(R.id.drive_button_bar_button_right);
        Button button = (Button) inflate.findViewById(R.id.drive_button_bar_button_left);
        lof lof = new lof(this);
        this.l.setOnClickListener(lof);
        this.l.setText(R.string.common_save);
        this.l.setEnabled(false);
        button.setOnClickListener(lof);
        button.setText(17039360);
        ((lnx) getActivity()).a((Toolbar) inflate.findViewById(R.id.drive_create_file_dialog_toolbar));
        return inflate;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (!this.k) {
            Activity activity = getActivity();
            if (activity != null) {
                activity.finish();
            }
            super.onDismiss(dialogInterface);
        }
    }

    public final void onPause() {
        super.onPause();
        this.c.b(lce.Q, this.j.getText().toString());
        if (getActivity() != null && !getActivity().isFinishing()) {
            this.o = this.n.e();
        }
    }

    public final void onResume() {
        super.onResume();
        this.l.setEnabled(false);
        icc icc = this.i;
        if (icc != null && icc.i()) {
            a();
        }
        lge lge = new lge(lsm.a(getActivity()), getActivity());
        Bundle bundle = this.o;
        if (bundle == null) {
            lfs a2 = lge.a(new CallingAppInfo(this.g, this.h, 0), this.f);
            this.n = a2;
            a2.a();
            lgc d2 = ((lgn) this.n).d();
            d2.j();
            d2.c(3, 28);
            d2.a();
            return;
        }
        this.n = lge.a(bundle);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("selectedCollectionDriveId", this.b);
        bundle.putParcelable("metadata", this.c);
        bundle.putInt("requestId", this.d);
        bundle.putInt("fileType", this.e);
        bundle.putParcelable("logSessionState", this.o);
    }

    public final void a(int i2) {
        lgc d2 = ((lgn) this.n).d();
        d2.c(3, 27);
        d2.e(i2);
        d2.j();
        d2.a();
        this.n.b();
    }

    public final void a(jzr jzr) {
        String str;
        int i2;
        String str2;
        int i3;
        DriveId driveId = jzf.e.a(this.i).a;
        if (jzr == null || driveId.equals(jzr.a())) {
            this.b = driveId;
            str2 = lqj.a.a(getActivity());
            i2 = lqj.a.a;
            str = str2;
        } else {
            this.b = jzr.a();
            str2 = jzr.d();
            i2 = loe.a(jzr.c()).a(jzr.f());
            if (!jzr.f()) {
                i3 = R.string.drive_folder;
            } else {
                i3 = R.string.drive_document_type_shared_folder;
            }
            String string = getString(i3);
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(string).length());
            sb.append(str2);
            sb.append(" ");
            sb.append(string);
            str = sb.toString();
        }
        this.m.setText(str2);
        this.m.setCompoundDrawablesWithIntrinsicBounds(i2, 0, 0, 0);
        this.m.getCompoundDrawables()[0].setColorFilter(Color.parseColor((String) jzq.V.c()), PorterDuff.Mode.SRC_ATOP);
        this.m.setContentDescription(str);
    }
}
