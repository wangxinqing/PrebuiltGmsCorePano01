package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;
import com.google.android.gms.R;
import com.google.android.gms.plus.sharebox.Circle;
import java.util.ArrayList;

/* renamed from: zld  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zld extends DialogFragment implements DialogInterface.OnClickListener {
    private ArrayList a;
    private zlc b;
    private EditText c;
    private TextView d;
    private TextView e;

    private final void a(boolean z) {
        Button button = ((AlertDialog) getDialog()).getButton(-1);
        if (button != null) {
            button.setEnabled(z);
        } else if (Log.isLoggable("ShareBox", 5)) {
            Log.w("ShareBox", "Unable to toggle create circle dialog button enabled state");
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.b = (zlc) activity;
        } catch (ClassCastException e2) {
            String valueOf = String.valueOf(zlc.class.getSimpleName());
            throw new ClassCastException(valueOf.length() == 0 ? new String("Host must implement ") : "Host must implement ".concat(valueOf));
        }
    }

    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        this.b.d();
        dismiss();
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            a(false);
            this.b.a(this.c.getText().toString());
            dismiss();
            return;
        }
        onCancel(dialogInterface);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a = getArguments().getParcelableArrayList("circles");
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        View inflate = getActivity().getLayoutInflater().inflate(R.layout.plus_sharebox_create_circle_view, (ViewGroup) null);
        EditText editText = (EditText) inflate.findViewById(R.id.circle_name);
        this.c = editText;
        editText.addTextChangedListener(new zlb(this));
        this.d = (TextView) inflate.findViewById(R.id.circle_name_warning);
        this.e = (TextView) inflate.findViewById(R.id.circle_name_length_warning);
        AlertDialog create = new AlertDialog.Builder(new ContextThemeWrapper(getActivity(), 2132019132)).setTitle(R.string.plus_sharebox_circles_add_title).setView(inflate).setPositiveButton(17039370, this).setNegativeButton(17039360, this).setCancelable(true).create();
        create.getWindow().setSoftInputMode(4);
        return create;
    }

    public final void onResume() {
        super.onResume();
        a((CharSequence) this.c.getText());
    }

    public final void a(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            ArrayList arrayList = this.a;
            if (arrayList != null && !arrayList.isEmpty() && !TextUtils.isEmpty(charSequence)) {
                int size = this.a.size();
                int i = 0;
                while (i < size) {
                    if (!((Circle) this.a.get(i)).e.equalsIgnoreCase(charSequence.toString())) {
                        i++;
                    } else {
                        a(false);
                        this.d.setVisibility(0);
                        return;
                    }
                }
            }
            if (charSequence.length() > ((Integer) ysu.W.c()).intValue()) {
                a(false);
                this.e.setVisibility(0);
                return;
            }
            a(true);
            this.d.setVisibility(8);
            this.e.setVisibility(8);
            return;
        }
        a(false);
        this.d.setVisibility(8);
    }
}
