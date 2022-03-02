package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;
import com.google.android.gms.drive.DriveId;

/* renamed from: lop  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lop extends lny {
    public static final ith a = new ith("CreateFolderDialogFragm", "");
    public EditText b;
    public loo c;
    public boolean d = false;
    public DriveId e;

    public final void a() {
        Toast.makeText(getActivity(), R.string.drive_create_new_folder_error, 1).show();
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.c = (loo) activity;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.e = (DriveId) getArguments().getParcelable("parentDriveId");
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        lnx lnx = (lnx) getActivity();
        Context a2 = loc.a(lnx);
        EditText editText = new EditText(a2);
        this.b = editText;
        editText.setText(R.string.drive_default_new_folder_title);
        this.b.setSelectAllOnFocus(true);
        this.b.setSingleLine();
        this.b.setInputType(16385);
        AlertDialog.Builder builder = new AlertDialog.Builder(loc.a(lnx));
        builder.setTitle(R.string.drive_new_folder_title);
        EditText editText2 = this.b;
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.drive_Space_2);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.drive_Space_1);
        FrameLayout frameLayout = new FrameLayout(a2);
        frameLayout.addView(editText2);
        frameLayout.setPadding(dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset, 0);
        builder.setView(frameLayout);
        builder.setCancelable(true);
        builder.setPositiveButton(17039370, new lok(this));
        builder.setNegativeButton(17039360, new lol(this));
        builder.setOnKeyListener(loc.a);
        AlertDialog create = builder.create();
        this.b.setOnFocusChangeListener(new lom(create));
        loc.a(this.b, create);
        return create;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        loo loo;
        if (!this.d && (loo = this.c) != null) {
            loo.a(2, (DriveId) null);
        }
        super.onDismiss(dialogInterface);
    }

    public final void onResume() {
        super.onResume();
        this.d = false;
    }
}
