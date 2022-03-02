package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;

/* renamed from: gc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class gc extends gj implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    final DialogInterface.OnCancelListener a = new ga(this);
    private Handler ag;
    private final Runnable ah = new fz(this);
    final DialogInterface.OnDismissListener b = new gb(this);
    int c = 0;
    int d = 0;
    boolean e = true;
    boolean f = true;
    int g = -1;
    Dialog h;
    boolean i;
    boolean j;
    boolean k;

    /* access modifiers changed from: package-private */
    public final void a(boolean z, boolean z2) {
        if (!this.j) {
            this.j = true;
            this.k = false;
            Dialog dialog = this.h;
            if (dialog != null) {
                dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                this.h.dismiss();
                if (!z2) {
                    if (Looper.myLooper() == this.ag.getLooper()) {
                        onDismiss(this.h);
                    } else {
                        this.ag.post(this.ah);
                    }
                }
            }
            this.i = true;
            if (this.g >= 0) {
                getParentFragmentManager().a(this.g, 1);
                this.g = -1;
                return;
            }
            ht a2 = getParentFragmentManager().a();
            a2.c(this);
            if (z) {
                a2.g();
            } else {
                a2.f();
            }
        }
    }

    public void dismiss() {
        a(false, false);
    }

    public void dismissAllowingStateLoss() {
        a(true, false);
    }

    public Dialog getDialog() {
        return this.h;
    }

    public boolean getShowsDialog() {
        return this.f;
    }

    public int getTheme() {
        return this.d;
    }

    public boolean isCancelable() {
        return this.e;
    }

    public void onActivityCreated(Bundle bundle) {
        Bundle bundle2;
        super.onActivityCreated(bundle);
        if (this.f) {
            View view = getView();
            if (view != null) {
                if (view.getParent() == null) {
                    this.h.setContentView(view);
                } else {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
            }
            gl activity = getActivity();
            if (activity != null) {
                this.h.setOwnerActivity(activity);
            }
            this.h.setCancelable(this.e);
            this.h.setOnCancelListener(this.a);
            this.h.setOnDismissListener(this.b);
            if (bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
                this.h.onRestoreInstanceState(bundle2);
            }
        }
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (!this.k) {
            this.j = false;
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        this.ag = new Handler();
        if (this.I == 0) {
            z = true;
        } else {
            z = false;
        }
        this.f = z;
        if (bundle != null) {
            this.c = bundle.getInt("android:style", 0);
            this.d = bundle.getInt("android:theme", 0);
            this.e = bundle.getBoolean("android:cancelable", true);
            this.f = bundle.getBoolean("android:showsDialog", this.f);
            this.g = bundle.getInt("android:backStackId", -1);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        return new Dialog(requireContext(), getTheme());
    }

    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.h;
        if (dialog != null) {
            this.i = true;
            dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            this.h.dismiss();
            if (!this.j) {
                onDismiss(this.h);
            }
            this.h = null;
        }
    }

    public void onDetach() {
        super.onDetach();
        if (!this.k && !this.j) {
            this.j = true;
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.i) {
            a(true, true);
        }
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        if (!this.f) {
            return super.onGetLayoutInflater(bundle);
        }
        Dialog onCreateDialog = onCreateDialog(bundle);
        this.h = onCreateDialog;
        if (onCreateDialog == null) {
            return (LayoutInflater) this.E.c.getSystemService("layout_inflater");
        }
        setupDialog(onCreateDialog, this.c);
        return (LayoutInflater) this.h.getContext().getSystemService("layout_inflater");
    }

    public void onSaveInstanceState(Bundle bundle) {
        Bundle onSaveInstanceState;
        Dialog dialog = this.h;
        if (!(dialog == null || (onSaveInstanceState = dialog.onSaveInstanceState()) == null)) {
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i2 = this.c;
        if (i2 != 0) {
            bundle.putInt("android:style", i2);
        }
        int i3 = this.d;
        if (i3 != 0) {
            bundle.putInt("android:theme", i3);
        }
        if (!this.e) {
            bundle.putBoolean("android:cancelable", false);
        }
        if (!this.f) {
            bundle.putBoolean("android:showsDialog", false);
        }
        int i4 = this.g;
        if (i4 != -1) {
            bundle.putInt("android:backStackId", i4);
        }
    }

    public void onStart() {
        super.onStart();
        Dialog dialog = this.h;
        if (dialog != null) {
            this.i = false;
            dialog.show();
        }
    }

    public void onStop() {
        super.onStop();
        Dialog dialog = this.h;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public final Dialog requireDialog() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void setCancelable(boolean z) {
        this.e = z;
        Dialog dialog = this.h;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
    }

    public void setShowsDialog(boolean z) {
        this.f = z;
    }

    public void setStyle(int i2, int i3) {
        this.c = i2;
        if (i2 == 2 || i2 == 3) {
            this.d = 16973913;
        }
        if (i3 != 0) {
            this.d = i3;
        }
    }

    public void setupDialog(Dialog dialog, int i2) {
        if (!(i2 == 1 || i2 == 2)) {
            if (i2 == 3) {
                dialog.getWindow().addFlags(24);
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    public int show(ht htVar, String str) {
        this.j = false;
        this.k = true;
        htVar.a((gj) this, str);
        this.i = false;
        int f2 = htVar.f();
        this.g = f2;
        return f2;
    }

    public void showNow(hl hlVar, String str) {
        this.j = false;
        this.k = true;
        ht a2 = hlVar.a();
        a2.a((gj) this, str);
        a2.h();
    }

    public void show(hl hlVar, String str) {
        this.j = false;
        this.k = true;
        ht a2 = hlVar.a();
        a2.a((gj) this, str);
        a2.f();
    }
}
