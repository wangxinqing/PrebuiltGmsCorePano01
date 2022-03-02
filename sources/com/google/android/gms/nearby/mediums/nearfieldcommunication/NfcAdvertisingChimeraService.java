package com.google.android.gms.nearby.mediums.nearfieldcommunication;

import android.os.Bundle;
import com.google.android.chimera.HostApduService;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class NfcAdvertisingChimeraService extends HostApduService {
    public volatile usa a;

    private static urw a(urv urv) {
        try {
            asml asml = (asml) aucj.a((aucj) asml.e, urv.g, aubs.c());
            String str = asml.b;
            String str2 = asml.c;
            byte[] k = asml.d.k();
            if (str.isEmpty()) {
                ((anih) ((anih) ulh.a.d()).a("com.google.android.gms.nearby.mediums.nearfieldcommunication.NfcAdvertisingChimeraService", "a", 107, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Ignoring ADVERTISEMENT command from remote device. No service ID was passed in.");
                return urw.b();
            }
            byte[] c = usb.a().c(str);
            if (c == null) {
                ((anih) ((anih) ulh.a.d()).a("com.google.android.gms.nearby.mediums.nearfieldcommunication.NfcAdvertisingChimeraService", "a", 114, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Ignoring ADVERTISEMENT command from remote device. We are not currently advertising for service %s.", (Object) str);
                usb.a().a(str);
                return urw.b();
            }
            usb.a().a(str, str2, k);
            jjg jjg = ulh.a;
            return urw.a(c);
        } catch (auda e) {
            anih anih = (anih) ulh.a.d();
            anih.a((Throwable) e);
            ((anih) anih.a("com.google.android.gms.nearby.mediums.nearfieldcommunication.NfcAdvertisingChimeraService", "a", 96, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Ignoring ADVERTISEMENT command from remote device. Invalid protocol buffer data format.");
            return urw.b();
        }
    }

    private final boolean a() {
        return this.a != null;
    }

    private final urw b(urv urv) {
        String str = new String(urv.g);
        if (str.isEmpty()) {
            ((anih) ((anih) ulh.a.d()).a("com.google.android.gms.nearby.mediums.nearfieldcommunication.NfcAdvertisingChimeraService", "b", 133, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Ignoring CONNECT command from remote device. No service ID was passed in.");
            return urw.b();
        } else if (a()) {
            ((anih) ((anih) ulh.a.d()).a("com.google.android.gms.nearby.mediums.nearfieldcommunication.NfcAdvertisingChimeraService", "b", 140, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Ignoring CONNECT command from remote device. We already have a socket connection.");
            return urw.b();
        } else {
            ((anih) ((anih) ulh.a.d()).a("com.google.android.gms.nearby.mediums.nearfieldcommunication.NfcAdvertisingChimeraService", "b", 146, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Accepting incoming NFC connection.");
            usa usa = new usa();
            usa.a(new usc(this, usa));
            if (!usb.a().a(str, usa)) {
                ulu.a((ull) usa, "NFC", usa.a);
                return urw.b();
            }
            this.a = usa;
            return urw.a();
        }
    }

    private final urw c(urv urv) {
        if (!a()) {
            ((anih) ((anih) ulh.a.d()).a("com.google.android.gms.nearby.mediums.nearfieldcommunication.NfcAdvertisingChimeraService", "c", 161, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Ignoring DATA command from remote device. We do not have an ongoing socket.");
            return urw.b();
        }
        this.a.a(urv.g);
        return urw.a(this.a.a(urx.a(urv.i)));
    }

    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        StringBuilder sb = new StringBuilder();
        for (byte[] a2 : usb.a().b()) {
            sb.append("{ ");
            sb.append(ulu.a(a2));
            sb.append(" } ");
        }
        printWriter.println(String.format("NfcAdvertisingService { hasSocketConnection=%s, advertisements=%s }", new Object[]{Boolean.valueOf(a()), sb}));
    }

    public final void onDeactivated(int i) {
        String str;
        anih anih = (anih) ((anih) ulh.a.d()).a("com.google.android.gms.nearby.mediums.nearfieldcommunication.NfcAdvertisingChimeraService", "onDeactivated", 55, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)");
        if (i != 0) {
            str = i != 1 ? "UNKNOWN" : "DEACTIVATION_DESELECTED";
        } else {
            str = "DEACTIVATION_LINK_LOSS";
        }
        anih.a("Remote NFC device has disconnected: %s.", (Object) String.format(Locale.ENGLISH, "[%d]%s", new Object[]{Integer.valueOf(i), str}));
        ulu.a((ull) this.a, "NFC", "NfcAdvertisingSocket");
    }

    public final byte[] processCommandApdu(byte[] bArr, Bundle bundle) {
        urv urv;
        urw urw;
        urw urw2;
        urw urw3;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        byte[] bArr6;
        byte[] bArr7 = bArr;
        int length = bArr7.length;
        if (length < 4) {
            ((anih) ((anih) ulh.a.c()).a("urv", "a", 55, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to parse request %s because the byte array was too short", (Object) ulu.a(bArr));
            urv = null;
        } else {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            byte b = wrap.get();
            byte b2 = wrap.get();
            byte b3 = wrap.get();
            byte b4 = wrap.get();
            if (length == 4) {
                bArr6 = new byte[0];
                bArr5 = new byte[0];
                bArr4 = new byte[0];
                bArr3 = new byte[0];
                bArr2 = new byte[0];
            } else if (length == 5) {
                bArr6 = new byte[0];
                bArr5 = new byte[0];
                bArr4 = new byte[0];
                bArr3 = new byte[0];
                bArr2 = new byte[1];
            } else {
                byte b5 = bArr7[4];
                if (b5 == 0 && length == 7) {
                    bArr6 = new byte[0];
                    bArr5 = new byte[0];
                    bArr4 = new byte[0];
                    bArr3 = new byte[1];
                    bArr2 = new byte[2];
                } else if (b5 == 0) {
                    byte[] bArr8 = new byte[1];
                    byte[] bArr9 = {bArr7[5], bArr7[6]};
                    if (length >= urx.a(bArr9) + 7) {
                        int a2 = urx.a(bArr9);
                        byte[] bArr10 = new byte[a2];
                        byte[] bArr11 = new byte[0];
                        int i = length - (a2 + 7);
                        byte[] bArr12 = new byte[i];
                        if (i > 2) {
                            ((anih) ((anih) ulh.a.c()).a("urv", "a", 113, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to parse request %s because the byte array was too long", (Object) ulu.a(bArr));
                            urv = null;
                        } else {
                            bArr2 = bArr12;
                            bArr6 = bArr8;
                            bArr4 = bArr10;
                            bArr5 = bArr9;
                            bArr3 = bArr11;
                        }
                    } else {
                        ((anih) ((anih) ulh.a.c()).a("urv", "a", 102, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to parse request %s because the byte array was too short", (Object) ulu.a(bArr));
                        urv = null;
                    }
                } else {
                    byte[] bArr13 = new byte[0];
                    byte[] bArr14 = {b5};
                    if (length >= urx.a(bArr14) + 5) {
                        int a3 = urx.a(bArr14);
                        bArr4 = new byte[a3];
                        byte[] bArr15 = new byte[0];
                        int i2 = length - (a3 + 5);
                        byte[] bArr16 = new byte[i2];
                        if (i2 > 2) {
                            ((anih) ((anih) ulh.a.c()).a("urv", "a", 135, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to parse request %s because the byte array was too long", (Object) ulu.a(bArr));
                            urv = null;
                        } else {
                            bArr6 = bArr13;
                            bArr2 = bArr16;
                            bArr5 = bArr14;
                            bArr3 = bArr15;
                        }
                    } else {
                        ((anih) ((anih) ulh.a.c()).a("urv", "a", 124, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to parse request %s because the byte array was too short", (Object) ulu.a(bArr));
                        urv = null;
                    }
                }
            }
            wrap.get(bArr6);
            wrap.get(bArr5);
            wrap.get(bArr4);
            wrap.get(bArr3);
            wrap.get(bArr2);
            urv = new urv(b, b2, b3, b4, bArr4, urx.a(bArr2));
        }
        if (urv != null && urv.a == 0 && urv.b == -92) {
            return urw.a().d();
        }
        if (urv != null && urv.a == Byte.MIN_VALUE && urv.b == 1) {
            try {
                asml asml = (asml) aucj.a((aucj) asml.e, urv.g, aubs.c());
                String str = asml.b;
                String str2 = asml.c;
                byte[] k = asml.d.k();
                if (str.isEmpty()) {
                    ((anih) ((anih) ulh.a.d()).a("com.google.android.gms.nearby.mediums.nearfieldcommunication.NfcAdvertisingChimeraService", "a", 107, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Ignoring ADVERTISEMENT command from remote device. No service ID was passed in.");
                    urw3 = urw.b();
                } else {
                    byte[] c = usb.a().c(str);
                    if (c == null) {
                        ((anih) ((anih) ulh.a.d()).a("com.google.android.gms.nearby.mediums.nearfieldcommunication.NfcAdvertisingChimeraService", "a", 114, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Ignoring ADVERTISEMENT command from remote device. We are not currently advertising for service %s.", (Object) str);
                        usb.a().a(str);
                        urw3 = urw.b();
                    } else {
                        usb.a().a(str, str2, k);
                        jjg jjg = ulh.a;
                        urw3 = urw.a(c);
                    }
                }
            } catch (auda e) {
                anih anih = (anih) ulh.a.d();
                anih.a((Throwable) e);
                ((anih) anih.a("com.google.android.gms.nearby.mediums.nearfieldcommunication.NfcAdvertisingChimeraService", "a", 96, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Ignoring ADVERTISEMENT command from remote device. Invalid protocol buffer data format.");
                urw3 = urw.b();
            }
            return urw3.d();
        } else if (urv != null && urv.a == Byte.MIN_VALUE && urv.b == 2) {
            String str3 = new String(urv.g);
            if (str3.isEmpty()) {
                ((anih) ((anih) ulh.a.d()).a("com.google.android.gms.nearby.mediums.nearfieldcommunication.NfcAdvertisingChimeraService", "b", 133, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Ignoring CONNECT command from remote device. No service ID was passed in.");
                urw2 = urw.b();
            } else if (a()) {
                ((anih) ((anih) ulh.a.d()).a("com.google.android.gms.nearby.mediums.nearfieldcommunication.NfcAdvertisingChimeraService", "b", 140, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Ignoring CONNECT command from remote device. We already have a socket connection.");
                urw2 = urw.b();
            } else {
                ((anih) ((anih) ulh.a.d()).a("com.google.android.gms.nearby.mediums.nearfieldcommunication.NfcAdvertisingChimeraService", "b", 146, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Accepting incoming NFC connection.");
                usa usa = new usa();
                usa.a(new usc(this, usa));
                if (!usb.a().a(str3, usa)) {
                    ulu.a((ull) usa, "NFC", usa.a);
                    urw2 = urw.b();
                } else {
                    this.a = usa;
                    urw2 = urw.a();
                }
            }
            return urw2.d();
        } else if (urv != null && urv.a == Byte.MIN_VALUE && urv.b == 3) {
            if (!a()) {
                ((anih) ((anih) ulh.a.d()).a("com.google.android.gms.nearby.mediums.nearfieldcommunication.NfcAdvertisingChimeraService", "c", 161, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Ignoring DATA command from remote device. We do not have an ongoing socket.");
                urw = urw.b();
            } else {
                this.a.a(urv.g);
                urw = urw.a(this.a.a(urx.a(urv.i)));
            }
            return urw.d();
        } else {
            ((anih) ((anih) ulh.a.c()).a("com.google.android.gms.nearby.mediums.nearfieldcommunication.NfcAdvertisingChimeraService", "processCommandApdu", 46, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Received unknown NFC command %s. Erroring out.", (Object) ulu.a(bArr));
            return urw.b().d();
        }
    }
}
