package com.google.android.chimera;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.chimera.annotation.ChimeraApiVersion;

@ChimeraApiVersion(added = 0)
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class DialogFragment extends Fragment {
    public static final int STYLE_NORMAL = 0;
    public static final int STYLE_NO_FRAME = 2;
    public static final int STYLE_NO_INPUT = 3;
    public static final int STYLE_NO_TITLE = 1;
    private gc CE = null;

    private final bje a() {
        return (bje) getProxy();
    }

    public void dismiss() {
        a().superDismiss();
    }

    public void dismissAllowingStateLoss() {
        a().superDismissAllowingStateLoss();
    }

    public Object getContainerFragment() {
        return getProxy();
    }

    public Dialog getDialog() {
        return a().superGetDialog();
    }

    /* access modifiers changed from: protected */
    public gc getProxy() {
        if (this.CE == null) {
            setImpl(new DialogFragmentProxy(this));
        }
        return this.CE;
    }

    public boolean getShowsDialog() {
        return a().superGetShowsDialog();
    }

    public gc getSupportContainerFragment() {
        return getProxy();
    }

    public int getTheme() {
        return a().superGetTheme();
    }

    public boolean isCancelable() {
        return a().superIsCancelable();
    }

    public void onCancel(DialogInterface dialogInterface) {
        a().superOnCancel(dialogInterface);
    }

    public Dialog onCreateDialog(Bundle bundle) {
        return a().superOnCreateDialog(bundle);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        a().superOnDismiss(dialogInterface);
    }

    public void setCancelable(boolean z) {
        a().superSetCancelable(z);
    }

    /* access modifiers changed from: protected */
    public final void setImpl(gc gcVar) {
        super.setImpl(gcVar);
        this.CE = gcVar;
    }

    public void setShowsDialog(boolean z) {
        a().superSetShowsDialog(z);
    }

    public void setStyle(int i, int i2) {
        a().superSetStyle(i, i2);
    }

    public void setTargetFragment(DialogFragment dialogFragment, int i) {
        getProxy().setTargetFragment((DialogFragmentProxy) dialogFragment.getContainerFragment(), i);
    }

    public void setupDialog(Dialog dialog, int i) {
        a().superSetupDialog(dialog, i);
    }

    public int show(FragmentTransaction fragmentTransaction, String str) {
        return a().superShow(fragmentTransaction, str);
    }

    public void showNow(FragmentManager fragmentManager, String str) {
        a().superShowNow(fragmentManager, str);
    }

    public void show(FragmentManager fragmentManager, String str) {
        a().superShow(fragmentManager, str);
    }
}
