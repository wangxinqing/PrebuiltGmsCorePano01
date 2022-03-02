package defpackage;

/* renamed from: aehy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aehy {
    private Integer A;
    private Integer B;
    private Integer C;
    private Integer D;
    private Boolean E;
    private Boolean F;
    private Boolean G;
    private Boolean H;
    private Integer I;
    private Boolean J;
    private Boolean K;
    private Boolean L;
    private Boolean M;
    private Boolean N;
    private Boolean O;
    private Boolean P;
    private Boolean Q;
    private Boolean R;
    private Integer S;
    private Boolean T;
    private Boolean U;
    private Boolean V;
    private Boolean W;
    private Boolean X;
    private Boolean Y;
    private Boolean Z;
    public Short a;
    private Integer aa;
    private Boolean ab;
    private Boolean ac;
    private Boolean ad;
    private Integer ae;
    public byte[] b;
    private Integer c;
    private Integer d;
    private Integer e;
    private Integer f;
    private Integer g;
    private Integer h;
    private Integer i;
    private Boolean j;
    private Integer k;
    private Integer l;
    private Integer m;
    private Integer n;
    private Integer o;
    private Boolean p;
    private Boolean q;
    private Integer r;
    private Integer s;
    private Boolean t;
    private Short u;
    private Short v;
    private Short w;
    private Boolean x;
    private Boolean y;
    private Integer z;

    public final void A(boolean z2) {
        this.x = Boolean.valueOf(z2);
    }

    public final void B(boolean z2) {
        this.H = Boolean.valueOf(z2);
    }

    public final aeia a() {
        String str = this.c == null ? " gattOperationTimeoutSeconds" : "";
        if (this.d == null) {
            str = str.concat(" gattConnectionTimeoutSeconds");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" bluetoothToggleTimeoutSeconds");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" bluetoothToggleSleepSeconds");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" classicDiscoveryTimeoutSeconds");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" numDiscoverAttempts");
        }
        if (this.i == null) {
            str = String.valueOf(str).concat(" discoveryRetrySleepSeconds");
        }
        if (this.j == null) {
            str = String.valueOf(str).concat(" ignoreDiscoveryError");
        }
        if (this.k == null) {
            str = String.valueOf(str).concat(" sdpTimeoutSeconds");
        }
        if (this.l == null) {
            str = String.valueOf(str).concat(" numSdpAttempts");
        }
        if (this.m == null) {
            str = String.valueOf(str).concat(" numCreateBondAttempts");
        }
        if (this.n == null) {
            str = String.valueOf(str).concat(" numConnectAttempts");
        }
        if (this.o == null) {
            str = String.valueOf(str).concat(" numWriteAccountKeyAttempts");
        }
        if (this.p == null) {
            str = String.valueOf(str).concat(" toggleBluetoothOnFailure");
        }
        if (this.q == null) {
            str = String.valueOf(str).concat(" bluetoothStateUsesPolling");
        }
        if (this.r == null) {
            str = String.valueOf(str).concat(" bluetoothStatePollingMillis");
        }
        if (this.s == null) {
            str = String.valueOf(str).concat(" numAttempts");
        }
        if (this.t == null) {
            str = String.valueOf(str).concat(" enableBrEdrHandover");
        }
        if (this.u == null) {
            str = String.valueOf(str).concat(" brHandoverDataCharacteristicId");
        }
        if (this.v == null) {
            str = String.valueOf(str).concat(" bluetoothSigDataCharacteristicId");
        }
        if (this.a == null) {
            str = String.valueOf(str).concat(" firmwareVersionCharacteristicId");
        }
        if (this.w == null) {
            str = String.valueOf(str).concat(" brTransportBlockDataDescriptorId");
        }
        if (this.x == null) {
            str = String.valueOf(str).concat(" waitForUuidsAfterBonding");
        }
        if (this.y == null) {
            str = String.valueOf(str).concat(" receiveUuidsAndBondedEventBeforeClose");
        }
        if (this.z == null) {
            str = String.valueOf(str).concat(" removeBondTimeoutSeconds");
        }
        if (this.A == null) {
            str = String.valueOf(str).concat(" removeBondSleepMillis");
        }
        if (this.B == null) {
            str = String.valueOf(str).concat(" createBondTimeoutSeconds");
        }
        if (this.C == null) {
            str = String.valueOf(str).concat(" hidCreateBondTimeoutSeconds");
        }
        if (this.D == null) {
            str = String.valueOf(str).concat(" proxyTimeoutSeconds");
        }
        if (this.E == null) {
            str = String.valueOf(str).concat(" rejectPhonebookAccess");
        }
        if (this.F == null) {
            str = String.valueOf(str).concat(" rejectMessageAccess");
        }
        if (this.G == null) {
            str = String.valueOf(str).concat(" rejectSimAccess");
        }
        if (this.H == null) {
            str = String.valueOf(str).concat(" writeSharedSecretKey");
        }
        if (this.I == null) {
            str = String.valueOf(str).concat(" writeAccountKeySleepMillis");
        }
        if (this.J == null) {
            str = String.valueOf(str).concat(" skipDisconnectingGattBeforeWritingAccountKey");
        }
        if (this.K == null) {
            str = String.valueOf(str).concat(" skipDiscoveryBeforeCreateBondForOlderThanOreo");
        }
        if (this.L == null) {
            str = String.valueOf(str).concat(" acceptPasskey");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" supportedProfileUuids");
        }
        if (this.M == null) {
            str = String.valueOf(str).concat(" providerInitiatesBondingIfSupported");
        }
        if (this.N == null) {
            str = String.valueOf(str).concat(" attemptDirectConnectionWhenPreviouslyBonded");
        }
        if (this.O == null) {
            str = String.valueOf(str).concat(" automaticallyReconnectGattWhenNeeded");
        }
        if (this.P == null) {
            str = String.valueOf(str).concat(" skipConnectingProfiles");
        }
        if (this.Q == null) {
            str = String.valueOf(str).concat(" ignoreUuidTimeoutAfterBonded");
        }
        if (this.R == null) {
            str = String.valueOf(str).concat(" specifyCreateBondTransportType");
        }
        if (this.S == null) {
            str = String.valueOf(str).concat(" createBondTransportType");
        }
        if (this.T == null) {
            str = String.valueOf(str).concat(" increaseIntentFilterPriority");
        }
        if (this.U == null) {
            str = String.valueOf(str).concat(" evaluatePerformance");
        }
        if (this.V == null) {
            str = String.valueOf(str).concat(" enableNamingCharacteristic");
        }
        if (this.W == null) {
            str = String.valueOf(str).concat(" enableFirmwareVersionCharacteristic");
        }
        if (this.X == null) {
            str = String.valueOf(str).concat(" keepSameAccountKeyWrite");
        }
        if (this.Y == null) {
            str = String.valueOf(str).concat(" enableDesktopExperimental");
        }
        if (this.Z == null) {
            str = String.valueOf(str).concat(" isRetroactivePairing");
        }
        if (this.aa == null) {
            str = String.valueOf(str).concat(" numSdpAttemptsAfterBonded");
        }
        if (this.ab == null) {
            str = String.valueOf(str).concat(" supportHidDevice");
        }
        if (this.ac == null) {
            str = String.valueOf(str).concat(" enablePairingWhileDirectlyConnecting");
        }
        if (this.ad == null) {
            str = String.valueOf(str).concat(" acceptConsentForFastPairOne");
        }
        if (this.ae == null) {
            str = String.valueOf(str).concat(" gattConnectRetryTimeoutMillis");
        }
        if (str.isEmpty()) {
            return new aeey(this.c.intValue(), this.d.intValue(), this.e.intValue(), this.f.intValue(), this.g.intValue(), this.h.intValue(), this.i.intValue(), this.j.booleanValue(), this.k.intValue(), this.l.intValue(), this.m.intValue(), this.n.intValue(), this.o.intValue(), this.p.booleanValue(), this.q.booleanValue(), this.r.intValue(), this.s.intValue(), this.t.booleanValue(), this.u.shortValue(), this.v.shortValue(), this.a.shortValue(), this.w.shortValue(), this.x.booleanValue(), this.y.booleanValue(), this.z.intValue(), this.A.intValue(), this.B.intValue(), this.C.intValue(), this.D.intValue(), this.E.booleanValue(), this.F.booleanValue(), this.G.booleanValue(), this.H.booleanValue(), this.I.intValue(), this.J.booleanValue(), this.K.booleanValue(), this.L.booleanValue(), this.b, this.M.booleanValue(), this.N.booleanValue(), this.O.booleanValue(), this.P.booleanValue(), this.Q.booleanValue(), this.R.booleanValue(), this.S.intValue(), this.T.booleanValue(), this.U.booleanValue(), this.V.booleanValue(), this.W.booleanValue(), this.X.booleanValue(), this.Y.booleanValue(), this.Z.booleanValue(), this.aa.intValue(), this.ab.booleanValue(), this.ac.booleanValue(), this.ad.booleanValue(), this.ae.intValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    public final void b() {
        this.T = true;
    }

    public final void c(int i2) {
        this.e = Integer.valueOf(i2);
    }

    public final void d(int i2) {
        this.g = Integer.valueOf(i2);
    }

    public final void e(int i2) {
        this.B = Integer.valueOf(i2);
    }

    public final void f(int i2) {
        this.S = Integer.valueOf(i2);
    }

    public final void g(int i2) {
        this.i = Integer.valueOf(i2);
    }

    public final void h(int i2) {
        this.ae = Integer.valueOf(i2);
    }

    public final void i(int i2) {
        this.d = Integer.valueOf(i2);
    }

    public final void j(int i2) {
        this.c = Integer.valueOf(i2);
    }

    public final void k(int i2) {
        this.C = Integer.valueOf(i2);
    }

    public final void l(int i2) {
        this.s = Integer.valueOf(i2);
    }

    public final void m(int i2) {
        this.n = Integer.valueOf(i2);
    }

    public final void n(int i2) {
        this.m = Integer.valueOf(i2);
    }

    public final void o(int i2) {
        this.h = Integer.valueOf(i2);
    }

    public final void p(int i2) {
        this.l = Integer.valueOf(i2);
    }

    public final void q(int i2) {
        this.aa = Integer.valueOf(i2);
    }

    public final void r(int i2) {
        this.o = Integer.valueOf(i2);
    }

    public final void s(int i2) {
        this.D = Integer.valueOf(i2);
    }

    public final void t(int i2) {
        this.A = Integer.valueOf(i2);
    }

    public final void u(int i2) {
        this.z = Integer.valueOf(i2);
    }

    public final void v(int i2) {
        this.k = Integer.valueOf(i2);
    }

    public final void w(int i2) {
        this.I = Integer.valueOf(i2);
    }

    public final void x(boolean z2) {
        this.R = Boolean.valueOf(z2);
    }

    public final void y(boolean z2) {
        this.ab = Boolean.valueOf(z2);
    }

    public final void z(boolean z2) {
        this.p = Boolean.valueOf(z2);
    }

    public final void b(int i2) {
        this.f = Integer.valueOf(i2);
    }

    public final void c(short s2) {
        this.w = Short.valueOf(s2);
    }

    public final void d(boolean z2) {
        this.O = Boolean.valueOf(z2);
    }

    public final void e(boolean z2) {
        this.q = Boolean.valueOf(z2);
    }

    public final void f(boolean z2) {
        this.t = Boolean.valueOf(z2);
    }

    public final void g(boolean z2) {
        this.Y = Boolean.valueOf(z2);
    }

    public final void h(boolean z2) {
        this.W = Boolean.valueOf(z2);
    }

    public final void i(boolean z2) {
        this.V = Boolean.valueOf(z2);
    }

    public final void j(boolean z2) {
        this.ac = Boolean.valueOf(z2);
    }

    public final void k(boolean z2) {
        this.U = Boolean.valueOf(z2);
    }

    public final void l(boolean z2) {
        this.j = Boolean.valueOf(z2);
    }

    public final void m(boolean z2) {
        this.Q = Boolean.valueOf(z2);
    }

    public final void n(boolean z2) {
        this.Z = Boolean.valueOf(z2);
    }

    public final void o(boolean z2) {
        this.X = Boolean.valueOf(z2);
    }

    public final void p(boolean z2) {
        this.M = Boolean.valueOf(z2);
    }

    public final void q(boolean z2) {
        this.y = Boolean.valueOf(z2);
    }

    public final void r(boolean z2) {
        this.F = Boolean.valueOf(z2);
    }

    public final void s(boolean z2) {
        this.E = Boolean.valueOf(z2);
    }

    public final void t(boolean z2) {
        this.G = Boolean.valueOf(z2);
    }

    public final void u(boolean z2) {
        this.P = Boolean.valueOf(z2);
    }

    public final void v(boolean z2) {
        this.J = Boolean.valueOf(z2);
    }

    public final void w(boolean z2) {
        this.K = Boolean.valueOf(z2);
    }

    public final void b(short s2) {
        this.u = Short.valueOf(s2);
    }

    public final void c(boolean z2) {
        this.N = Boolean.valueOf(z2);
    }

    public final void b(boolean z2) {
        this.L = Boolean.valueOf(z2);
    }

    public final void a(int i2) {
        this.r = Integer.valueOf(i2);
    }

    public final void a(short s2) {
        this.v = Short.valueOf(s2);
    }

    public final void a(boolean z2) {
        this.ad = Boolean.valueOf(z2);
    }
}
