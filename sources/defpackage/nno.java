package defpackage;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.util.Log;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;
import com.google.android.gms.R;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: nno  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nno extends DialogFragment implements DialogInterface.OnClickListener {
    private String a;
    private String b;

    private static final int a(Context context, String str) {
        try {
            return jni.b(context).b(str, 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(str);
            Log.w("V1UpgradeDialogFragment", valueOf.length() == 0 ? new String("Could not find package info for package: ") : "Could not find package info for package: ".concat(valueOf));
            return -1;
        }
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Activity activity = getActivity();
        if (activity != null) {
            if (i == -1) {
                Intent b2 = itg.b("com.google.android.play.games");
                b2.setData(b2.getData().buildUpon().appendQueryParameter("pcampaignid", "GPG_playGamesUpsell").build());
                try {
                    activity.startActivity(b2);
                } catch (ActivityNotFoundException e) {
                    nmf.b("V1UpgradeDialogFragment", "Unable to launch play store intent", e);
                }
            }
            activity.finish();
            if (i == -1) {
                a(37);
            } else if (i == -2) {
                a(36);
            }
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        int i;
        this.a = getArguments().getString("game_package_name");
        this.b = getArguments().getString("game_id");
        a(35);
        if (!jgu.e(getActivity())) {
            i = R.string.games_required_dialog_message;
        } else {
            i = R.string.games_required_dialog_message_restricted;
        }
        sr srVar = new sr(getActivity(), 2132017686);
        srVar.a.c = R.drawable.games_dialog_ic;
        srVar.a((int) R.string.games_required_dialog_title);
        srVar.b(i);
        srVar.b((int) R.string.games_required_dialog_go_to_play_store, (DialogInterface.OnClickListener) this);
        srVar.a((int) R.string.common_cancel, (DialogInterface.OnClickListener) this);
        return srVar.b();
    }

    private final void a(int i) {
        aucd o = nnf.d.o();
        Context context = getContext();
        String str = this.a;
        String str2 = this.b;
        aucd o2 = nni.h.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        nni nni = (nni) o2.b;
        nni.a |= 1;
        nni.b = false;
        String valueOf = String.valueOf(hxj.b);
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        nni nni2 = (nni) o2.b;
        valueOf.getClass();
        nni2.a |= 16;
        nni2.e = valueOf;
        long a2 = (long) a(context, "com.google.android.play.games");
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        nni nni3 = (nni) o2.b;
        int i2 = nni3.a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        nni3.a = i2;
        nni3.g = a2;
        if (str2 != null) {
            str2.getClass();
            i2 |= 2;
            nni3.a = i2;
            nni3.c = str2;
        }
        if (str != null) {
            str.getClass();
            nni3.a = i2 | 8;
            nni3.d = str;
        }
        int a3 = a(context, str);
        if (a3 > 0) {
            long j = (long) a3;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            nni nni4 = (nni) o2.b;
            nni4.a |= 32;
            nni4.f = j;
        }
        nni nni5 = (nni) o2.i();
        if (o.c) {
            o.c();
            o.c = false;
        }
        nnf nnf = (nnf) o.b;
        nni5.getClass();
        nnf.b = nni5;
        nnf.a |= 1;
        aucd o3 = nnh.c.o();
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        nnh nnh = (nnh) o3.b;
        nnh.b = i - 1;
        nnh.a |= 1;
        nnh nnh2 = (nnh) o3.i();
        if (o.c) {
            o.c();
            o.c = false;
        }
        nnf nnf2 = (nnf) o.b;
        nnh2.getClass();
        nnf2.c = nnh2;
        nnf2.a |= 4;
        nnf nnf3 = (nnf) o.i();
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            new hol(getContext(), "GAMES", (String) null).a(nnf3.k()).b();
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }
}
