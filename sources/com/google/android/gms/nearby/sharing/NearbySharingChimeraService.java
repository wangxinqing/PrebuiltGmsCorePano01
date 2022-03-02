package com.google.android.gms.nearby.sharing;

import android.accounts.Account;
import android.app.KeyguardManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.PowerManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.provider.ContactsContract;
import android.text.SpannedString;
import android.text.TextUtils;
import com.google.android.cast.JGCastService;
import com.google.android.gms.R;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class NearbySharingChimeraService extends nio {
    public static final Charset a = Charset.forName("UTF-8");
    private boolean A = false;
    private boolean B = false;
    private boolean C = false;
    private boolean D;
    private boolean E;
    private boolean F;
    private ScheduledExecutorService G;
    private BroadcastReceiver H;
    private BroadcastReceiver I;
    public wbx b;
    public wbo k;
    public final Map l = new nz();
    public final Map m = new nz();
    public boolean n = false;
    public vwi o;
    public vna p;
    public final Context q = new vt((Context) this, 2132017974);
    public vva r = new vva();
    public long s;
    public oq t;
    public oq u;
    public volatile jfx v;
    public final vmw w = new vmw();
    private boolean x;
    private wbw y;
    private int z = -1;

    public NearbySharingChimeraService() {
        super(194, "com.google.android.gms.nearby.sharing.START_SERVICE", Collections.emptySet(), 3, 9);
    }

    private final boolean A() {
        return !this.l.isEmpty();
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0010  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean B() {
        /*
            r4 = this;
            java.util.Map r0 = r4.m
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x000a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x002c
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getValue()
            vmx r1 = (defpackage.vmx) r1
            int r1 = r1.b
            r2 = 1
            if (r1 == r2) goto L_0x002b
            r3 = 2
            if (r1 == r3) goto L_0x002b
            r3 = 3
            if (r1 == r3) goto L_0x002b
            r3 = 4
            if (r1 == r3) goto L_0x002b
            goto L_0x000a
        L_0x002b:
            return r2
        L_0x002c:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.nearby.sharing.NearbySharingChimeraService.B():boolean");
    }

    private final void C() {
        this.o.f();
        this.n = false;
        this.C = false;
        this.p.a();
        usb.a().a("NearbySharing", (PendingIntent) null);
        ((anih) vvj.a.d()).a("Fast Initiation Scanning has stopped");
    }

    private static String a(Account account, String str) {
        String str2 = account.name;
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        return sb.toString();
    }

    private final amzy x() {
        return this.w.a();
    }

    private final amzy y() {
        return this.w.b();
    }

    private final void z() {
        this.A = true;
        if (ayni.x()) {
            f();
            return;
        }
        g();
        if (ayni.i()) {
            h();
        }
    }

    public final int b(ShareTarget shareTarget) {
        int d = a(shareTarget).d(shareTarget);
        this.t = null;
        jfx jfx = this.v;
        if (jfx != null) {
            jfx.interrupt();
        }
        ((anih) vvj.a.d()).a("Client cancelled file with %s, result: %s", (Object) shareTarget, d);
        return d;
    }

    public final String c(int i) {
        if (i == 1) {
            return "OFFLINE";
        }
        if (i == 2) {
            return "ONLINE";
        }
        if (i == 3) {
            return "WIFI_ONLY";
        }
        int l2 = l();
        StringBuilder sb = new StringBuilder(20);
        sb.append("UNKNOWN[");
        sb.append(l2);
        sb.append("]");
        return sb.toString();
    }

    public final int d(boolean z2) {
        int i;
        if (k() == z2) {
            return 35500;
        }
        String str = "enabled";
        d().edit().putBoolean(str, z2).apply();
        if (!z2) {
            w();
            t();
            C();
            this.b.h();
            ((anih) vvj.a.d()).a("Shut down SharingProvider");
            thp.a(this.q, this.H);
            thp.a(this.q, this.I);
            qwq.a(this.q).a("SharingServerSync", "com.google.android.gms.nearby.sharing.SharingSyncService");
        }
        this.w.a("INTERNAL_PROVIDER_ID");
        this.b = c();
        if (z2) {
            vna.c();
            a();
        }
        this.b.a(m());
        if (ayni.x()) {
            f();
        } else {
            g();
        }
        v();
        anih anih = (anih) vvj.a.d();
        if (!z2) {
            str = "disabled";
        }
        anih.a("NearbySharing was %s", (Object) str);
        vva vva = this.r;
        if (!z2) {
            i = 3;
        } else {
            i = 2;
        }
        aucd d = vvb.d(3);
        aucd o2 = aslg.c.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aslg aslg = (aslg) o2.b;
        aslg.b = i - 1;
        aslg.a |= 1;
        aslg aslg2 = (aslg) o2.i();
        if (d.c) {
            d.c();
            d.c = false;
        }
        asmc asmc = (asmc) d.b;
        asmc asmc2 = asmc.B;
        aslg2.getClass();
        asmc.d = aslg2;
        asmc.a |= 8;
        vva.a(new vuv((asmc) d.i()));
        return 0;
    }

    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str;
        super.dump(fileDescriptor, printWriter, strArr);
        printWriter.write("\n");
        printWriter.write(String.format("%s\n", new Object[]{"com.google.android.gms.nearby.sharing.NearbySharingService"}));
        printWriter.write(String.format("  Version: %s\n", new Object[]{ayni.Q()}));
        printWriter.write(String.format("  Device Type: %s\n", new Object[]{ayni.j()}));
        printWriter.write(String.format("  Account Type: %s\n", new Object[]{ayni.b()}));
        printWriter.write(String.format("  Device name: %s\n", new Object[]{d().getString("device_name", "null")}));
        printWriter.write(String.format("  isOptedIn: %s\n", new Object[]{Boolean.valueOf(j())}));
        printWriter.write(String.format("  isEnabled: %s\n", new Object[]{Boolean.valueOf(k())}));
        printWriter.write(String.format("  isAdvertising: %s\n", new Object[]{Boolean.valueOf(s())}));
        printWriter.write(String.format("  isScanning: %s\n", new Object[]{Boolean.valueOf(this.x)}));
        printWriter.write(String.format("  isTransferringFiles: %s\n", new Object[]{Boolean.valueOf(this.A)}));
        printWriter.write(String.format("  isScreenUnlocked: %s\n", new Object[]{Boolean.valueOf(this.D)}));
        printWriter.write(String.format("  isBluetoothEnabled: %s\n", new Object[]{Boolean.valueOf(this.F)}));
        printWriter.write(String.format("  isLocationEnabled: %s\n", new Object[]{Boolean.valueOf(this.E)}));
        Object[] objArr = new Object[1];
        int m2 = m();
        if (m2 == 0) {
            str = "NO_ONE";
        } else if (m2 == 1) {
            str = "ALL_CONTACTS";
        } else if (m2 != 2) {
            int m3 = m();
            StringBuilder sb = new StringBuilder(20);
            sb.append("UNKNOWN[");
            sb.append(m3);
            sb.append("]");
            str = sb.toString();
        } else {
            str = "SELECTED_CONTACTS";
        }
        objArr[0] = str;
        printWriter.write(String.format("  Visibility: %s\n", objArr));
        printWriter.write(String.format("  Data Usage Preference: %s\n", new Object[]{c(l())}));
        Object[] objArr2 = new Object[1];
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        for (Integer intValue : this.l.values()) {
            int intValue2 = intValue.intValue();
            if (sb2.length() > 1) {
                sb2.append(", ");
            }
            if (intValue2 == 0) {
                sb2.append("ReceiveSurfaceState.BACKGROUND");
            } else if (intValue2 != 1) {
                sb2.append("SendSurfaceState.UNKNOWN");
            } else {
                sb2.append("ReceiveSurfaceState.FOREGROUND");
            }
        }
        sb2.append("]");
        objArr2[0] = sb2.toString();
        printWriter.write(String.format("  Registered receive surfaces: %s\n", objArr2));
        Object[] objArr3 = new Object[1];
        StringBuilder sb3 = new StringBuilder();
        sb3.append("[");
        for (vmx vmx : this.m.values()) {
            if (sb3.length() > 1) {
                sb3.append(", ");
            }
            int i = vmx.b;
            if (i == 0) {
                sb3.append("SendSurfaceState.BACKGROUND");
            } else if (i == 1) {
                sb3.append("SendSurfaceState.FOREGROUND");
            } else if (i != 2) {
                sb3.append("SendSurfaceState.UNKNOWN");
            } else {
                sb3.append("SendSurfaceState.DIRECT_SHARE_SERVICE");
            }
        }
        sb3.append("]");
        objArr3[0] = sb3.toString();
        printWriter.write(String.format("  Registered send surfaces: %s\n", objArr3));
        printWriter.write(String.format("  isFastInitAdvertising: %s\n", new Object[]{Boolean.valueOf(this.o.c())}));
        printWriter.write(String.format("  isFastInitScanning: %s\n", new Object[]{Boolean.valueOf(this.o.e())}));
        vwi vwi = this.o;
        printWriter.write(String.format("%s\n", new Object[]{"com.google.android.gms.nearby.sharing.discovery.FastInitiation"}));
        printWriter.write(String.format("  Scan mode: %s\n", new Object[]{vwi.c(vwi.b)}));
        printWriter.write(String.format("  Current advertising fast init type: %s\n", new Object[]{vwi.d(vwi.e)}));
        printWriter.write(String.format("  Reported BLE meta data: %s\n", new Object[]{vwi.d}));
        printWriter.write(String.format("  %s\n", new Object[]{"Sighted BLE peripherals"}));
        anhj a2 = anaf.a(vwi.c).entrySet().iterator();
        while (a2.hasNext()) {
            Map.Entry entry = (Map.Entry) a2.next();
            printWriter.write(String.format("    %s -> %s\n", new Object[]{entry.getKey(), entry.getValue()}));
        }
        printWriter.flush();
        this.k.a(printWriter);
        this.b.a(printWriter);
        printWriter.flush();
    }

    public final void e() {
        Object obj;
        acwa b2 = who.b(this);
        try {
            acws.a(b2);
            obj = b2.d();
        } catch (InterruptedException | ExecutionException e) {
            anih anih = (anih) tgb.a.b();
            anih.a(e);
            anih.a("Failed %s while waiting for the task.", (Object) "getSupportedAccounts");
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            obj = null;
        }
        ArrayList arrayList = (ArrayList) obj;
        if (arrayList == null || arrayList.isEmpty()) {
            a((Account) null);
            return;
        }
        String string = d().getString("account", "");
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Account account = (Account) arrayList.get(i);
            i++;
            if (string.equals(account.name)) {
                a(account);
                return;
            }
        }
        a((Account) arrayList.get(0));
    }

    public final void f() {
        h();
        g();
    }

    public final void g() {
        i();
        if (!this.D) {
            ((anih) vvj.a.d()).a("Stopping Fast Init because the screen is locked.");
            C();
        } else if (!this.E) {
            C();
            ((anih) vvj.a.d()).a("Stopping Fast Init because location is disabled.");
        } else if (!this.F && !this.o.b()) {
            C();
            ((anih) vvj.a.d()).a("Stopping Fast Init because Bluetooth is disabled.");
        } else if (k() && p()) {
            C();
            ((anih) vvj.a.d()).a("Stopping Fast Init because we're visible to everyone already.");
        } else if (this.x) {
            C();
            ((anih) vvj.a.d()).a("Stopping Fast Init because we're scanning for other devices.");
        } else if (this.A) {
            C();
            ((anih) vvj.a.d()).a("Stopping Fast Init because we're currently in the midst of a transfer.");
        } else if (j() && !k()) {
            C();
            ((anih) vvj.a.d()).a("Stopping Fast Init because we're disabled.");
        } else if (!this.D) {
            ((anih) vvj.a.d()).a("Failed to scan for fast initiation because the user's screen is locked.");
        } else if (!this.E) {
            ((anih) vvj.a.d()).a("Failed to scan for fast initiation because location is disabled.");
        } else {
            boolean k2 = k();
            if (u()) {
                if (k2 != this.C) {
                    ((anih) vvj.a.d()).a("Restarting scanning for fast initiation with isHighPowerAllowed=%s", (Object) Boolean.valueOf(k2));
                    C();
                } else {
                    ((anih) vvj.a.d()).a("Failed to scan for fast initiation because we're already scanning with isHighPowerAllowed=%s.", (Object) Boolean.valueOf(this.C));
                    return;
                }
            }
            usb.a().a("NearbySharing", PendingIntent.getActivity(this, 0, new Intent().setClassName(this, "com.google.android.gms.nearby.sharing.ReceiveSurfaceActivity").addFlags(268435456).addFlags(32768), JGCastService.FLAG_PRIVATE_DISPLAY));
            if (!this.F && !this.o.b()) {
                ((anih) vvj.a.d()).a("Failed to scan for fast initiation because Bluetooth is disabled.");
            } else if (this.o.a(k2, new vjf(this))) {
                this.C = k2;
                ((anih) vvj.a.d()).a("Fast Initiation Scanning has started");
            } else {
                this.C = false;
            }
        }
    }

    public final void h() {
        if (!this.D) {
            w();
            ((anih) vvj.a.d()).a("Stopping discovery because the screen is locked.");
        } else if (!this.F) {
            w();
            ((anih) vvj.a.d()).a("Stopping discovery because Bluetooth is disabled.");
        } else if (!k()) {
            w();
            ((anih) vvj.a.d()).a("Stopping discovery because Nearby Sharing is disabled.");
        } else if (this.A || this.B) {
            w();
            ((anih) vvj.a.d()).a("Stopping discovery because we're currently in the midst of a transfer.");
        } else if (!B()) {
            w();
            ((anih) vvj.a.d()).a("Stopping discovery because no scanning surface has been registered.");
        } else if (!k()) {
            ((anih) vvj.a.d()).a("Failed to scan because we're not enabled.");
        } else if (!this.D) {
            ((anih) vvj.a.d()).a("Failed to scan because the user's screen is locked.");
        } else if (!this.F) {
            ((anih) vvj.a.d()).a("Failed to scan because Bluetooth is off.");
        } else if (this.x) {
            ((anih) vvj.a.d()).a("Failed to scan because we're currently scanning.");
        } else if (!B()) {
            ((anih) vvj.a.d()).a("Failed to scan because there's no scanning send surface registered.");
        } else {
            this.s = SystemClock.elapsedRealtime();
            this.x = true;
            g();
            int i = this.z;
            if (i == -1) {
                i = l();
            }
            vkd vkd = new vkd(this);
            wbs wbs = new wbs();
            wbs.a = i;
            vux vux = new vux();
            int i2 = 2;
            if (!a(1)) {
                if (!a(3)) {
                    if (!a(2)) {
                        i2 = 0;
                    }
                } else {
                    i2 = 3;
                }
            } else {
                i2 = 1;
            }
            vux.a = i2;
            wbs.b = vux.a();
            wbt wbt = new wbt(wbs.a, wbs.b);
            if (x().isEmpty()) {
                ((anih) vvj.a.c()).a("Failed to scan since no provider has been registered");
            } else {
                this.b.a(vkd, wbt);
                anhk i3 = y().listIterator();
                while (i3.hasNext()) {
                    ((wbx) i3.next()).a(vkd, wbt);
                }
                h();
                q();
                ((anih) vvj.a.d()).a("Scanning has started");
            }
        }
        if (!this.F) {
            this.o.d();
            ((anih) vvj.a.d()).a("Stopping Fast Init advertisement because Bluetooth is off.");
        } else if (!this.x && !this.B) {
            this.o.d();
            ((anih) vvj.a.d()).a("Stopping Fast Init advertisement because we're not scanning.");
        } else {
            if (this.o.a(true ^ a(1) ? 1 : 0)) {
                vva vva = this.r;
                aucd d = vvb.d(10);
                aslu aslu = aslu.a;
                if (d.c) {
                    d.c();
                    d.c = false;
                }
                asmc asmc = (asmc) d.b;
                asmc asmc2 = asmc.B;
                aslu.getClass();
                asmc.k = aslu;
                asmc.a |= 1024;
                vva.a(new vuu((asmc) d.i()));
            }
            ((anih) vvj.a.d()).a("Starting Fast Init advertisement because we're currently scanning/connecting.");
        }
    }

    public final void i() {
        wbw wbw;
        if (!this.D) {
            t();
            ((anih) vvj.a.d()).a("Stopping advertising because the screen is locked.");
        } else if (!this.F) {
            t();
            ((anih) vvj.a.d()).a("Stopping advertising because Bluetooth is disabled.");
        } else if (!k()) {
            t();
            ((anih) vvj.a.d()).a("Stopping advertising because Nearby Sharing is disabled.");
        } else if (this.x) {
            t();
            ((anih) vvj.a.d()).a("Stopping advertising because we're scanning for other devices.");
        } else if (this.A) {
            t();
            ((anih) vvj.a.d()).a("Stopping advertising because we're currently in the midst of a transfer.");
        } else if (!A()) {
            t();
            ((anih) vvj.a.d()).a("Stopping advertising because no receive surface is registered.");
        } else if (m() != 0 || p()) {
            if (p()) {
                wbw = wbw.HIGH_POWER;
            } else if (this.n) {
                wbw = wbw.MEDIUM_POWER;
            } else {
                wbw wbw2 = wbw.LOW_POWER;
                t();
                ((anih) vvj.a.d()).a("Stopping advertising with power level %s, since there's no scanning phone nearby and no receiver surface in foreground.", (Object) wbw2);
                return;
            }
            String n2 = p() ? n() : null;
            if (!k()) {
                ((anih) vvj.a.d()).a("Failed to advertise because we're not enabled.");
            } else if (this.x) {
                ((anih) vvj.a.d()).a("Failed to advertise because we're currently scanning for other devices.");
            } else if (!A()) {
                ((anih) vvj.a.d()).a("Failed to advertise because there's no receive surface registered.");
            } else if (!this.D) {
                ((anih) vvj.a.d()).a("Failed to advertise because the user's screen is locked.");
            } else if (!this.F) {
                ((anih) vvj.a.d()).a("Failed to advertise because Bluetooth is off.");
            } else {
                int l2 = l();
                if (s()) {
                    if (wbw.equals(this.y) && l2 == this.z) {
                        ((anih) vvj.a.d()).a("Failed to advertise because we're already advertising with power level %s and data usage preference %s", (Object) this.y, (Object) c(this.z));
                        return;
                    } else {
                        t();
                        ((anih) vvj.a.d()).a("Restart advertising with power level %s and data usage preference %s", (Object) wbw, (Object) c(l2));
                    }
                }
                vju vju = new vju(this);
                wbp wbp = new wbp();
                wbp.a = wbw;
                wbq wbq = new wbq(wbp.a, l2);
                this.b.a(n2, (vtx) vju, wbq);
                if (ayni.n() && wbw == wbw.HIGH_POWER) {
                    anhk i = y().listIterator();
                    while (i.hasNext()) {
                        ((wbx) i.next()).a(n2, (vtx) vju, wbq);
                    }
                }
                q();
                this.y = wbw;
                this.z = l2;
                ((anih) vvj.a.d()).a("Advertising has started with power level %s", (Object) wbw);
            }
        } else {
            t();
            ((anih) vvj.a.d()).a("Stopping advertising because no high power receive surface is registered and device is visible to NO_ONE.");
        }
    }

    public final boolean j() {
        return d().getBoolean("opt_in", false);
    }

    public final boolean k() {
        if (ayni.p()) {
            return d().getBoolean("enabled", false);
        }
        return false;
    }

    public final int l() {
        return d().getInt("data_usage", 2);
    }

    public final int m() {
        Account r2 = r();
        if (r2 == null) {
            return 0;
        }
        int i = d().getInt("visibility", 1);
        return ayni.I() ? d().getInt(a(r2, "visibility"), i) : i;
    }

    public final String n() {
        String str;
        int i;
        String str2;
        String string = d().getString("device_name", "");
        if (TextUtils.isEmpty(string)) {
            Context context = this.q;
            Account r2 = r();
            String str3 = null;
            if (!Locale.ENGLISH.getDisplayLanguage().equals(Locale.getDefault().getDisplayLanguage())) {
                str = null;
            } else {
                if (r2 != null) {
                    try {
                        str = ((whn) acws.a(who.b(context, r2))).b();
                    } catch (InterruptedException | ExecutionException e) {
                    }
                }
                Cursor a2 = tgw.a(context, ContactsContract.Profile.CONTENT_URI);
                if (a2 != null) {
                    try {
                        str2 = tgw.a(a2, "display_name");
                    } finally {
                        a2.close();
                    }
                } else {
                    str2 = null;
                }
                str = !TextUtils.isEmpty(str2) ? (String) anbs.a(amsk.b("\\s+").a((CharSequence) str2), 0) : null;
            }
            if (TextUtils.isEmpty(str) || ampw.a("null", str)) {
                string = wij.b(context);
            } else {
                vt vtVar = (vt) context;
                Resources a3 = vtVar.a();
                if (!wid.d(context)) {
                    i = R.string.sharing_device_type_phone;
                } else {
                    i = R.string.sharing_device_type_tablet;
                }
                CharSequence text = a3.getText(i);
                int integer = vtVar.a().getInteger(R.integer.sharing_max_name_length_bytes);
                int a4 = whu.a(context.getString(R.string.sharing_default_device_name, new Object[]{"", text}));
                if (a4 >= integer) {
                    ((anih) ((anih) vvj.a.c()).a("wij", "a", 305, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Device type string is longer than char limit.");
                } else {
                    str3 = wih.a(str, integer - a4);
                }
                if (TextUtils.isEmpty(str3)) {
                    string = wij.b(context);
                } else {
                    string = context.getString(R.string.sharing_default_device_name, new Object[]{str3, text});
                }
            }
            CharSequence filter = new arzl(getResources().getInteger(R.integer.sharing_max_name_length_bytes)).filter(string, 0, string.length(), new SpannedString(""), 0, 0);
            if (filter != null) {
                string = filter.toString();
            }
            this.k.c(string);
        }
        return string;
    }

    public final void o() {
        this.A = false;
        if (ayni.x()) {
            a((Runnable) new vjo(this), ayni.N());
            return;
        }
        a((Runnable) new vjp(this), ayni.N());
        if (ayni.i()) {
            a((Runnable) new vjq(this), ayni.N());
        }
    }

    public final void onCreate() {
        if (this.G == null) {
            this.G = tid.a();
        }
        if (this.k == null) {
            Context context = this.q;
            String string = d().getString("device_id", (String) null);
            if (string == null) {
                SecureRandom secureRandom = new SecureRandom();
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < 10; i++) {
                    sb.append("ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".charAt(secureRandom.nextInt(36)));
                }
                string = sb.toString();
                d().edit().putString("device_id", string).apply();
            }
            this.k = new wbo(context, string);
        }
        if (this.b == null) {
            this.b = c();
        }
        vna a2 = vna.a(this.q);
        this.p = a2;
        a2.b();
        this.o = new vwi(this);
        final PowerManager powerManager = (PowerManager) getSystemService("power");
        final KeyguardManager keyguardManager = (KeyguardManager) getSystemService("keyguard");
        AnonymousClass2 r3 = new nla("nearby") {
            public final void a(Context context, Intent intent) {
                NearbySharingChimeraService nearbySharingChimeraService = NearbySharingChimeraService.this;
                vjv vjv = new vjv(this, powerManager, keyguardManager);
                Charset charset = NearbySharingChimeraService.a;
                nearbySharingChimeraService.a((Runnable) vjv);
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        registerReceiver(r3, intentFilter);
        a((Runnable) new vjk(this, powerManager, keyguardManager));
        registerReceiver(new nla("nearby") {
            public final void a(Context context, Intent intent) {
                NearbySharingChimeraService nearbySharingChimeraService = NearbySharingChimeraService.this;
                vjw vjw = new vjw(this, context);
                Charset charset = NearbySharingChimeraService.a;
                nearbySharingChimeraService.a((Runnable) vjw);
            }
        }, new IntentFilter("android.location.MODE_CHANGED"));
        a((Runnable) new vjl(this));
        registerReceiver(new nla("nearby") {
            public final void a(Context context, Intent intent) {
                NearbySharingChimeraService nearbySharingChimeraService = NearbySharingChimeraService.this;
                vjx vjx = new vjx(this);
                Charset charset = NearbySharingChimeraService.a;
                nearbySharingChimeraService.a((Runnable) vjx);
            }
        }, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
        a((Runnable) new vjm(this));
        AnonymousClass1 r0 = new nla("nearby") {
            public final void a(Context context, Intent intent) {
                NearbySharingChimeraService nearbySharingChimeraService = NearbySharingChimeraService.this;
                vjr vjr = new vjr(this, intent);
                Charset charset = NearbySharingChimeraService.a;
                nearbySharingChimeraService.a((Runnable) vjr);
            }
        };
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE");
        intentFilter2.addCategory("com.google.android.gms.auth.category.ACCOUNT_REMOVED");
        intentFilter2.addCategory("com.google.android.gms.auth.category.ACCOUNT_ADDED");
        registerReceiver(r0, intentFilter2, "com.google.android.gms.auth.permission.GOOGLE_ACCOUNT_CHANGE", (Handler) null);
        a((Runnable) new vjc(this));
        ((anih) vvj.a.d()).a("NearbySharingService created");
    }

    public final void onDestroy() {
        a((Runnable) new vjj(this));
        tid.a(this.G, "NearbySharingServiceExecutor");
        ((anih) vvj.a.d()).a("NearbySharingService destroyed");
    }

    public final boolean onUnbind(Intent intent) {
        return true;
    }

    public final boolean p() {
        return this.l.containsValue(1);
    }

    public final void q() {
        long currentTimeMillis = System.currentTimeMillis();
        if (!d().contains("privacy_notification")) {
            d().edit().putLong("privacy_notification", currentTimeMillis).apply();
            ((anih) vvj.a.d()).a("Timestamp saved in shared preference for the first time");
            return;
        }
        long j = d().getLong("privacy_notification", currentTimeMillis);
        ((anih) vvj.a.d()).a("Timestamp for last notification is %d", j);
        if (currentTimeMillis - j > ayni.B() * TimeUnit.DAYS.toMillis(1)) {
            vna vna = this.p;
            tgx tgx = new tgx(vna.a, "nearby_sharing_privacy");
            tgx.j();
            tgx.b(whr.b(kf.a(vna.a, (int) R.drawable.sharing_ic_launcher)));
            tgx.g(vna.a.getText(R.string.sharing_notification_privacy_title));
            tgx.f(vna.a.getText(R.string.sharing_notification_privacy_description));
            tgx.f = PendingIntent.getActivity(vna.a, 1001, new Intent().setClassName(vna.a, "com.google.android.gms.nearby.sharing.SettingsActivity").addFlags(268435456).addFlags(32768), 134217728);
            tgx.h();
            tgx.j = 0;
            tgx.s = "msg";
            tgx.d(true);
            tgx.u = wid.a(vna.a);
            tgx.q = "nearby_sharing";
            tgx.a(vna.a.getString(R.string.sharing_product_name));
            vna.a(tgx);
            vna.a("nearby_sharing", 4, tgx.b());
            d().edit().putLong("privacy_notification", currentTimeMillis).apply();
            ((anih) vvj.a.d()).a("Sharing enabled and have at least one preferred visibility. %d days since last notification. Privacy notification displayed. Timestamp updated.", ayni.B());
        }
    }

    public final Account r() {
        return this.k.b();
    }

    public final boolean s() {
        return this.y != null;
    }

    public final void t() {
        if (!s()) {
            ((anih) vvj.a.d()).a("Failed to stop advertising because we weren't advertising.");
            return;
        }
        this.b.b();
        if (ayni.n() && this.y == wbw.HIGH_POWER) {
            anhk i = y().listIterator();
            while (i.hasNext()) {
                ((wbx) i.next()).b();
            }
        }
        this.z = -1;
        this.y = null;
        ((anih) vvj.a.d()).a("Advertising has stopped");
    }

    public final boolean u() {
        return this.o.e();
    }

    public final void v() {
        thp.a((Context) this, "com.google.android.gms.nearby.sharing.STATE_CHANGED");
        ((anih) vvj.a.d()).a("Broadcasting NearbySharing state change.");
    }

    public final void w() {
        if (!this.x) {
            ((anih) vvj.a.d()).a("Failed to stop scanning because weren't scanning.");
            return;
        }
        anhk i = x().listIterator();
        while (i.hasNext()) {
            ((wbx) i.next()).a();
        }
        this.x = false;
        a((Runnable) new vjn(this), ayni.N());
        ((anih) vvj.a.d()).a("Scanning has stopped.");
    }

    public static void a(String str, String str2, ifu ifu, Callable callable) {
        String str3;
        int i = 13;
        if (ayni.p()) {
            try {
                i = ((Integer) callable.call()).intValue();
            } catch (Exception e) {
                anih anih = (anih) vvj.a.c();
                anih.a((Throwable) e);
                anih.a("Exception while executing NearbySharingService call %s for calling package %s.", (Object) str2, (Object) str);
            }
        }
        Status status = new Status(i);
        if (!status.c()) {
            anih anih2 = (anih) vvj.a.c();
            switch (i) {
                case 35500:
                    str3 = "STATUS_ALREADY_IN_DESIRED_STATE";
                    break;
                case 35501:
                    str3 = "STATUS_DISABLED";
                    break;
                case 35502:
                    str3 = "STATUS_ALREADY_STOPPED";
                    break;
                case 35503:
                    str3 = "STATUS_RESET";
                    break;
                case 35504:
                    str3 = "STATUS_AT_MOST_ONE_FOREGROUND_RECEIVE_SURFACE_ALLOWED";
                    break;
                case 35505:
                    str3 = "STATUS_ACCOUNT_NOT_LOGGED_IN";
                    break;
                case 35506:
                    str3 = "STATUS_DISK_IO_ERROR";
                    break;
                case 35507:
                    str3 = "STATUS_CONTACT_ALREADY_EXISTS";
                    break;
                case 35508:
                    str3 = "STATUS_CONTACT_DOES_NOT_EXIST";
                    break;
                case 35509:
                    str3 = "STATUS_ACTIVITY_NOT_FOUND";
                    break;
                case 35510:
                    str3 = "STATUS_NETWORK_IO_ERROR";
                    break;
                case 35511:
                    str3 = "STATUS_OUT_OF_ORDER_API_CALL";
                    break;
                case 35512:
                    str3 = "STATUS_AT_MOST_ONE_FOREGROUND_SEND_SURFACE_ALLOWED";
                    break;
                case 35513:
                    str3 = "STATUS_ACCESS_DENIED";
                    break;
                default:
                    str3 = ibt.a(i);
                    break;
            }
            anih2.a("NearbySharingService call %s returned nonzero status code for calling package %s: %s", (Object) str2, (Object) str, (Object) str3);
        }
        try {
            ifu.a(status);
        } catch (RemoteException e2) {
            anih anih3 = (anih) vvj.a.c();
            anih3.a((Throwable) e2);
            anih3.a("Failed to invoke IStatusCallback.");
        }
    }

    /* access modifiers changed from: package-private */
    public final wbx c() {
        wbx b2 = this.w.b("INTERNAL_PROVIDER_ID");
        if (b2 == null) {
            if (ayni.a.a().bm()) {
                b2 = new wha();
            } else if (!k()) {
                b2 = new wcr(this, this.k, this.r);
            } else {
                b2 = new wgu(this, this.k, this.r);
            }
            this.w.a(b2, new vmv("INTERNAL_PROVIDER_ID", getPackageName()));
        }
        return b2;
    }

    public final List b(int i) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.l.entrySet()) {
            if (((Integer) entry.getValue()).intValue() == i) {
                arrayList.add((vtx) entry.getKey());
            }
        }
        return arrayList;
    }

    public final List b(Integer... numArr) {
        ArrayList arrayList = new ArrayList();
        anax a2 = anax.a((Object[]) numArr);
        for (Map.Entry entry : this.m.entrySet()) {
            if (a2.contains(Integer.valueOf(((vmx) entry.getValue()).b))) {
                arrayList.add(new oq((vtx) entry.getKey(), ((vmx) entry.getValue()).a));
            }
        }
        return arrayList;
    }

    public final void b() {
        this.b.g();
        if (!j()) {
            return;
        }
        if (this.k.b() == null) {
            a(0);
        } else if (ayni.C()) {
            new vvq(this.q).a(this.k.b()).a((acvv) new vji(this));
        }
    }

    public final int a(int i) {
        Account r2 = r();
        if (ayni.I() && r2 == null) {
            ((anih) vvj.a.c()).a("Cannot change device visibility without an account.");
            return 13;
        }
        int m2 = m();
        if (m2 == i) {
            if (d().contains("visibility")) {
                return 35500;
            }
            if (ayni.I() && d().contains(a(r2, "visibility"))) {
                return 35500;
            }
            this.r.a(vvb.a(i, i));
            return 35500;
        } else if (i == 0 || i == 1 || i == 2) {
            if (ayni.I()) {
                d().edit().putInt(a(r2, "visibility"), i).apply();
            } else {
                d().edit().putInt("visibility", i).apply();
            }
            this.b.a(i);
            ((anih) vvj.a.d()).a("Visibility mode changed to %d", i);
            this.r.a(vvb.a(m2, i));
            if (s()) {
                t();
            }
            g();
            v();
            return 0;
        } else {
            ((anih) vvj.a.c()).a("Invalid visibility. Refer to SharingClient to see all valid cases.");
            return 13;
        }
    }

    public final void c(boolean z2) {
        this.F = z2;
        ((anih) vvj.a.d()).a("Bluetooth is %s", (Object) !z2 ? "disabled" : "enabled");
        f();
    }

    public final void b(ShareTarget shareTarget, TransferMetadata transferMetadata) {
        if (!transferMetadata.e) {
            int i = transferMetadata.a;
            if (i == 12) {
                this.B = false;
                z();
            } else if (i == 2) {
                this.B = false;
                z();
            }
        } else {
            this.B = false;
            o();
        }
        List b2 = b(1, 3);
        if (b2.isEmpty()) {
            b2 = b(0);
        }
        int size = b2.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((vtx) ((oq) b2.get(i2)).a).a(shareTarget, transferMetadata);
        }
        if (!a(1, 3) || !transferMetadata.e) {
            vtv a2 = vtv.a(transferMetadata);
            a2.b();
            this.u = new oq(shareTarget, a2.a());
        } else {
            this.u = null;
        }
        if (!ayni.i()) {
            h();
        }
    }

    public final void b(boolean z2) {
        String str;
        this.E = z2;
        anih anih = (anih) vvj.a.d();
        if (!z2) {
            str = "disabled";
        } else {
            str = "enabled";
        }
        anih.a("Location is %s", (Object) str);
        if (ayni.x()) {
            f();
        } else {
            g();
        }
    }

    public final int a(Account account) {
        if (!this.k.a(account)) {
            return 13;
        }
        if (account != null) {
            d().edit().putString("account", account.name).apply();
            this.r.a((Context) this, account);
        } else {
            d().edit().remove("account").apply();
            this.r.a((Context) this, (Account) null);
        }
        v();
        b();
        return 0;
    }

    public final SharedPreferences d() {
        return getSharedPreferences("nearbysharing:service:state", 0);
    }

    public final int a(ShareTarget shareTarget, Intent intent) {
        PendingIntent pendingIntent;
        if (!this.x) {
            ((anih) vvj.a.d()).a("Failed to send file to remote ShareTarget. Not scanning.");
            return 13;
        } else if (this.m.isEmpty()) {
            ((anih) vvj.a.d()).a("Failed to send file to remote ShareTarget. No registered share sheet.");
            return 13;
        } else if (this.A) {
            ((anih) vvj.a.d()).a("Failed to send file to remote ShareTarget. Already transferring a file.");
            b(shareTarget, new vtv(7).a());
            return 13;
        } else {
            if (shareTarget.b().isEmpty()) {
                aosh f = aosh.f();
                vke vke = new vke(this, shareTarget, f);
                aosh f2 = aosh.f();
                new jfx(9, new vjd(this, f2, intent)).start();
                this.v = new jfx(9, new vje(this, vke, f2));
                this.v.start();
                if (thr.a("downloadAttachments", (Future) f) != 0) {
                    ((anih) vvj.a.c()).a("Failed to send file to remote ShareTarget. No attachment found.");
                    b(shareTarget, new vtv(11).a());
                    return 13;
                }
            }
            vva vva = this.r;
            List b2 = shareTarget.b();
            aucd d = vvb.d(5);
            aucd o2 = asle.c.o();
            asld a2 = vvb.a(b2);
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            asle asle = (asle) o2.b;
            a2.getClass();
            asle.b = a2;
            asle.a |= 1;
            asle asle2 = (asle) o2.i();
            if (d.c) {
                d.c();
                d.c = false;
            }
            asmc asmc = (asmc) d.b;
            asmc asmc2 = asmc.B;
            asle2.getClass();
            asmc.f = asle2;
            asmc.a |= 32;
            vva.a(new vuu((asmc) d.i()));
            if (intent.hasExtra("com.google.android.gms.nearby.sharing.EXTRA_REQUIRED_PACKAGE")) {
                shareTarget.e.putString("com.google.android.gms.nearby.sharing.EXTRA_REQUIRED_PACKAGE", intent.getStringExtra("com.google.android.gms.nearby.sharing.EXTRA_REQUIRED_PACKAGE"));
            }
            z();
            this.B = true;
            h();
            if (!ayni.o() || (pendingIntent = shareTarget.m) == null) {
                a(shareTarget).a(n(), shareTarget, (vtx) new vkg(this));
                return 0;
            }
            String a3 = this.w.a(shareTarget);
            if (!TextUtils.isEmpty(a3)) {
                List list = shareTarget.g;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    a(a3, ((FileAttachment) list.get(i)).d);
                }
                try {
                    pendingIntent.send(this, 0, intent);
                    ((anih) vvj.a.d()).a("Sent to %s by action %s for package %s", (Object) shareTarget, (Object) pendingIntent, (Object) a3);
                } catch (PendingIntent.CanceledException e) {
                    anih anih = (anih) vvj.a.c();
                    anih.a((Throwable) e);
                    anih.a("Failed to send to %s by action %s for package %s", (Object) shareTarget, (Object) pendingIntent, (Object) a3);
                }
                b(shareTarget, new vtv(15).a());
                return 0;
            }
            b(shareTarget, new vtv(7).a());
            ((anih) vvj.a.d()).a("Unable to send to %s by action %s due to missing package name", (Object) shareTarget, (Object) pendingIntent);
            return 13;
        }
    }

    public final int a(vtx vtx, vsh vsh, int i) {
        oq oqVar;
        if (!ayni.G()) {
            if (a(1, 3) && (i == 1 || i == 3)) {
                ((anih) vvj.a.d()).a("Only one foreground send surface allowed.");
                return 35512;
            }
        }
        if ((i == 1 || i == 3) && (oqVar = this.u) != null) {
            vsh.a((ShareTarget) oqVar.a);
            oq oqVar2 = this.u;
            vtx.a((ShareTarget) oqVar2.a, (TransferMetadata) oqVar2.b);
            if (!ayni.G() && ((TransferMetadata) this.u.b).e) {
                this.u = null;
            }
        }
        this.m.put(vtx, new vmx(vsh, i));
        for (ShareTarget a2 : this.b.f()) {
            vsh.a(a2);
        }
        ((anih) vvj.a.d()).a("A share sheet has been registered");
        h();
        v();
        return 0;
    }

    public final List a(int i, int i2, ContactFilter contactFilter) {
        List<Contact> c = this.b.c();
        if (contactFilter != null) {
            Boolean bool = contactFilter.a;
            Boolean bool2 = contactFilter.b;
            Boolean bool3 = contactFilter.c;
            String str = contactFilter.d;
            ArrayList arrayList = new ArrayList();
            for (Contact contact : c) {
                if ((bool == null || contact.e == bool.booleanValue()) && ((bool2 == null || contact.g == bool2.booleanValue()) && (bool3 == null || contact.h == bool3.booleanValue()))) {
                    if (str != null) {
                        String a2 = ampw.a(str);
                        if (!ampw.a(contact.c).contains(a2) && !ampw.a(contact.f.b).contains(a2)) {
                        }
                    }
                    arrayList.add(contact);
                }
            }
            c = arrayList;
        }
        Collections.sort(c);
        if (i >= c.size()) {
            ((anih) vvj.a.d()).a("Offset %d >= valid contact list size. Return empty list", i);
            return new ArrayList();
        }
        if (i2 == 0) {
            i2 = c.size();
        }
        return c.subList(i, Math.min(i2 + i, c.size()));
    }

    public final wbx a(ShareTarget shareTarget) {
        wbx b2 = this.w.b(shareTarget);
        if (b2 != null) {
            return b2;
        }
        ((anih) vvj.a.c()).a("Failed to fetch provider for %s", (Object) shareTarget);
        return new wcq();
    }

    public final void a() {
        this.H = new nla("nearby") {
            public final void a(Context context, Intent intent) {
                NearbySharingChimeraService nearbySharingChimeraService = NearbySharingChimeraService.this;
                vjy vjy = new vjy(this);
                Charset charset = NearbySharingChimeraService.a;
                nearbySharingChimeraService.a((Runnable) vjy);
            }
        };
        this.I = new nla("nearby") {
            public final void a(Context context, Intent intent) {
                NearbySharingChimeraService nearbySharingChimeraService = NearbySharingChimeraService.this;
                vjz vjz = new vjz(this);
                Charset charset = NearbySharingChimeraService.a;
                nearbySharingChimeraService.a((Runnable) vjz);
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.nearby.sharing.SYNC_SERVER");
        thp.a(this, this.H, intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("com.google.android.gms.nearby.sharing.CERTIFICATES_REGENERATION");
        thp.a(this, this.I, intentFilter2);
        qwq a2 = qwq.a(this.q);
        qxi qxi = new qxi();
        qxi.i = "com.google.android.gms.nearby.sharing.SharingSyncService";
        qxi.a(0, axcc.c() ? 1 : 0);
        qxi.a(0);
        qxi.k = "SharingServerSync";
        qxi.a = ayni.a.a().bi();
        qxi.b = ayni.a.a().bh();
        qxj a3 = qxi.b();
        try {
            a2.a("SharingServerSync", "com.google.android.gms.nearby.sharing.SharingSyncService");
            a2.a((qxx) a3);
            ((anih) vvj.a.d()).a("Scheduled SharingSyncChimeraService periodic task.");
        } catch (IllegalArgumentException e) {
            anih anih = (anih) vvj.a.c();
            anih.a((Throwable) e);
            anih.a("Failed to schedule server sync task.");
        }
        b();
        this.b.e();
    }

    public final void a(ShareTarget shareTarget, TransferMetadata transferMetadata) {
        int i = transferMetadata.a;
        if (i == 9 || i == 8) {
            this.t = null;
        } else {
            vtv a2 = vtv.a(transferMetadata);
            a2.b();
            this.t = new oq(shareTarget, a2.a());
        }
        if (transferMetadata.e) {
            o();
        } else if (transferMetadata.a == 2) {
            if (!shareTarget.n && this.w.b(shareTarget) == null) {
                this.w.a(shareTarget, "INTERNAL_PROVIDER_ID");
            }
            z();
        }
        List b2 = b(p() ? 1 : 0);
        int size = b2.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((vtx) b2.get(i2)).a(shareTarget, transferMetadata);
        }
    }

    public final void a(Runnable runnable) {
        this.G.execute(runnable);
    }

    /* access modifiers changed from: package-private */
    public final void a(Runnable runnable, long j) {
        this.G.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }

    public final void a(String str, Uri uri) {
        this.q.grantUriPermission(str, uri, 1);
        jjg jjg = vvj.a;
    }

    /* access modifiers changed from: protected */
    public final void a(nit nit, GetServiceRequest getServiceRequest) {
        int i;
        String str = getServiceRequest.d;
        if (ayni.a.a().aB() || jhg.b()) {
            i = 2;
        } else {
            if (ayni.H()) {
                if (hya.a(this.q).b(str) || thh.a.a(this.q, str)) {
                    i = 3;
                } else if (thh.b.a(this.q, str)) {
                    i = 4;
                }
            }
            i = 1;
        }
        int i2 = i - 1;
        if (i2 == 1 || i2 == 2) {
            nit.a(new vmt(this, str));
            ((anih) vvj.a.d()).a("A new client has bound to the NearbySharingService ClientBridge for calling package %s", (Object) str);
        } else if (i2 != 3) {
            nit.a(35513, (Bundle) null);
            ((anih) vvj.a.d()).a("A new client failed to bind to the NearbySharingService for calling package %s", (Object) str);
        } else {
            nit.a(new vmu(this, str));
            ((anih) vvj.a.d()).a("A new client has bound to the NearbySharingService ExternalClientBridge for calling package %s", (Object) str);
        }
    }

    public final void a(boolean z2) {
        String str;
        this.D = z2;
        anih anih = (anih) vvj.a.d();
        if (!z2) {
            str = "locked";
        } else {
            str = "unlocked";
        }
        anih.a("Screen is %s", (Object) str);
        if (ayni.x()) {
            f();
        } else {
            g();
        }
    }

    public final boolean a(Integer... numArr) {
        anax a2 = anax.a((Object[]) numArr);
        for (Map.Entry value : this.m.entrySet()) {
            if (a2.contains(Integer.valueOf(((vmx) value.getValue()).b))) {
                return true;
            }
        }
        return false;
    }
}
