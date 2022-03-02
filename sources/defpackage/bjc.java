package defpackage;

import android.app.admin.DeviceAdminReceiver;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: bjc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bjc extends DeviceAdminReceiver {
    private final com.google.android.chimera.DeviceAdminReceiver a;

    public bjc(com.google.android.chimera.DeviceAdminReceiver deviceAdminReceiver) {
        this.a = deviceAdminReceiver;
    }

    public final DevicePolicyManager a(Context context) {
        return super.getManager(context);
    }

    public final ComponentName b(Context context) {
        return super.getWho(context);
    }

    public final void c(Context context, Intent intent) {
        super.onDisabled(context, intent);
    }

    public final void d(Context context, Intent intent) {
        super.onPasswordChanged(context, intent);
    }

    public final void e(Context context, Intent intent) {
        super.onPasswordFailed(context, intent);
    }

    public final void f(Context context, Intent intent) {
        super.onPasswordSucceeded(context, intent);
    }

    public final void g(Context context, Intent intent) {
        super.onPasswordExpiring(context, intent);
    }

    public final DevicePolicyManager getManager(Context context) {
        return this.a.getManager(context);
    }

    public final ComponentName getWho(Context context) {
        return this.a.getWho(context);
    }

    public final void h(Context context, Intent intent) {
        super.onProfileProvisioningComplete(context, intent);
    }

    public final void i(Context context, Intent intent) {
        super.onReadyForUserInitialization(context, intent);
    }

    public final void j(Context context, Intent intent) {
        super.onLockTaskModeExiting(context, intent);
    }

    public final String onChoosePrivateKeyAlias(Context context, Intent intent, int i, Uri uri, String str) {
        return this.a.onChoosePrivateKeyAlias(context, intent, i, uri, str);
    }

    public final CharSequence onDisableRequested(Context context, Intent intent) {
        return this.a.onDisableRequested(context, intent);
    }

    public final void onDisabled(Context context, Intent intent) {
        this.a.onDisabled(context, intent);
    }

    public final void onEnabled(Context context, Intent intent) {
        this.a.onEnabled(context, intent);
    }

    public final void onLockTaskModeEntering(Context context, Intent intent, String str) {
        this.a.onLockTaskModeEntering(context, intent, str);
    }

    public final void onLockTaskModeExiting(Context context, Intent intent) {
        this.a.onLockTaskModeExiting(context, intent);
    }

    public final void onPasswordChanged(Context context, Intent intent) {
        this.a.onPasswordChanged(context, intent);
    }

    public final void onPasswordExpiring(Context context, Intent intent) {
        this.a.onPasswordExpiring(context, intent);
    }

    public final void onPasswordFailed(Context context, Intent intent) {
        this.a.onPasswordFailed(context, intent);
    }

    public final void onPasswordSucceeded(Context context, Intent intent) {
        this.a.onPasswordSucceeded(context, intent);
    }

    public final void onProfileProvisioningComplete(Context context, Intent intent) {
        this.a.onProfileProvisioningComplete(context, intent);
    }

    public final void onReadyForUserInitialization(Context context, Intent intent) {
        this.a.onReadyForUserInitialization(context, intent);
    }

    public final void onSystemUpdatePending(Context context, Intent intent, long j) {
        this.a.onSystemUpdatePending(context, intent, j);
    }

    public final String a(Context context, Intent intent, int i, Uri uri, String str) {
        return super.onChoosePrivateKeyAlias(context, intent, i, uri, str);
    }

    public final CharSequence b(Context context, Intent intent) {
        return super.onDisableRequested(context, intent);
    }

    public final void a(Context context, Intent intent) {
        super.onEnabled(context, intent);
    }

    public final void a(Context context, Intent intent, long j) {
        super.onSystemUpdatePending(context, intent, j);
    }

    public final void a(Context context, Intent intent, String str) {
        super.onLockTaskModeEntering(context, intent, str);
    }
}
