package defpackage;

/* renamed from: aqhu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqhu {
    private Boolean A;
    private Boolean B;
    private Boolean C;
    private Boolean D;
    private Double E;
    private Double F;
    private aqio G;
    private Integer H;
    private Double I;
    private Boolean J;
    public aqjq a;
    public aqii b;
    public aqii c;
    public aqic d;
    public aqia e;
    private Integer f;
    private Double g;
    private Double h;
    private Double i;
    private Double j;
    private Double k;
    private Double l;
    private Double m;
    private Double n;
    private Double o;
    private Double p;
    private Double q;
    private Double r;
    private Double s;
    private Boolean t;
    private Boolean u;
    private Double v;
    private Double w;
    private Double x;
    private Boolean y;
    private Boolean z;

    public final aqhw a() {
        String str = this.a == null ? " seedBox" : "";
        if (this.f == null) {
            str = str.concat(" numberOfParticles");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" resamplingThreshold");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" stepLengthFactor");
        }
        if (this.i == null) {
            str = String.valueOf(str).concat(" stepLengthNoiseSigmaM");
        }
        if (this.j == null) {
            str = String.valueOf(str).concat(" nominalSigmaScaleGnss");
        }
        if (this.k == null) {
            str = String.valueOf(str).concat(" nominalSigmaScaleWifi");
        }
        if (this.l == null) {
            str = String.valueOf(str).concat(" temporalHeadingNoiseSigmaRad");
        }
        if (this.m == null) {
            str = String.valueOf(str).concat(" temporalPositionNoiseSigmaM");
        }
        if (this.n == null) {
            str = String.valueOf(str).concat(" positionEmitThresholdS");
        }
        if (this.o == null) {
            str = String.valueOf(str).concat(" accuracyFactor");
        }
        if (this.p == null) {
            str = String.valueOf(str).concat(" minAccuracyM");
        }
        if (this.q == null) {
            str = String.valueOf(str).concat(" maxAccuracyM");
        }
        if (this.r == null) {
            str = String.valueOf(str).concat(" wifiReportedAccuracyUpperBoundBeforeRejectedMm");
        }
        if (this.s == null) {
            str = String.valueOf(str).concat(" positionWeightingRejectionThresholdSigmaMultiplier");
        }
        if (this.t == null) {
            str = String.valueOf(str).concat(" positionWeightingUsePositionLikelihoodClipping");
        }
        if (this.u == null) {
            str = String.valueOf(str).concat(" allowProposingFromGnss");
        }
        if (this.v == null) {
            str = String.valueOf(str).concat(" positionProposalGnssMaxAccuracyThresholdM");
        }
        if (this.w == null) {
            str = String.valueOf(str).concat(" positionProposalGnssMinSpeedThresholdMps");
        }
        if (this.x == null) {
            str = String.valueOf(str).concat(" positionProposalGnssBlueskyMinSpeedThresholdMps");
        }
        if (this.y == null) {
            str = String.valueOf(str).concat(" useBearingCarryDetectionFromIA");
        }
        if (this.z == null) {
            str = String.valueOf(str).concat(" resetLocationAfterReinit");
        }
        if (this.A == null) {
            str = String.valueOf(str).concat(" resetLocationAfterReinitV2");
        }
        if (this.B == null) {
            str = String.valueOf(str).concat(" extendedBugreportLogging");
        }
        if (this.C == null) {
            str = String.valueOf(str).concat(" enableDifferentialBearingFix140500114");
        }
        if (this.D == null) {
            str = String.valueOf(str).concat(" enableBlueskyShadowLikelihood");
        }
        if (this.E == null) {
            str = String.valueOf(str).concat(" blueskyUpdateMaxAgeSec");
        }
        if (this.F == null) {
            str = String.valueOf(str).concat(" blueskyUpdateTimeoutForProposeFromGnssSec");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" gnssPositionMeasurementConditionerConfiguration");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" wifiPositionMeasurementConditionerConfiguration");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" filterStatusConfiguration");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" blueskyWeightingConfiguration");
        }
        if (this.G == null) {
            str = String.valueOf(str).concat(" bluemoonEventLogger");
        }
        if (this.H == null) {
            str = String.valueOf(str).concat(" bugReportLoggingMaxBufferSize");
        }
        if (this.I == null) {
            str = String.valueOf(str).concat(" bugReportLoggingTimeWindowS");
        }
        if (this.J == null) {
            str = String.valueOf(str).concat(" bugReportStoreDataArrayOnly");
        }
        if (str.isEmpty()) {
            return new aqhn(this.a, this.f.intValue(), this.g.doubleValue(), this.h.doubleValue(), this.i.doubleValue(), this.j.doubleValue(), this.k.doubleValue(), this.l.doubleValue(), this.m.doubleValue(), this.n.doubleValue(), this.o.doubleValue(), this.p.doubleValue(), this.q.doubleValue(), this.r.doubleValue(), this.s.doubleValue(), this.t.booleanValue(), this.u.booleanValue(), this.v.doubleValue(), this.w.doubleValue(), this.x.doubleValue(), this.y.booleanValue(), this.z.booleanValue(), this.A.booleanValue(), this.B.booleanValue(), this.C.booleanValue(), this.D.booleanValue(), this.E.doubleValue(), this.F.doubleValue(), this.b, this.c, this.d, this.e, this.G, this.H.intValue(), this.I.doubleValue(), this.J.booleanValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    public final void b(double d2) {
        this.E = Double.valueOf(d2);
    }

    public final void c(double d2) {
        this.F = Double.valueOf(d2);
    }

    public final void d(double d2) {
        this.I = Double.valueOf(d2);
    }

    public final void e(double d2) {
        this.q = Double.valueOf(d2);
    }

    public final void f(double d2) {
        this.p = Double.valueOf(d2);
    }

    public final void g(double d2) {
        this.j = Double.valueOf(d2);
    }

    public final void h(double d2) {
        this.k = Double.valueOf(d2);
    }

    public final void i(double d2) {
        this.n = Double.valueOf(d2);
    }

    public final void j(double d2) {
        this.x = Double.valueOf(d2);
    }

    public final void k(double d2) {
        this.v = Double.valueOf(d2);
    }

    public final void l(double d2) {
        this.w = Double.valueOf(d2);
    }

    public final void m(double d2) {
        this.s = Double.valueOf(d2);
    }

    public final void n(double d2) {
        this.g = Double.valueOf(d2);
    }

    public final void o(double d2) {
        this.h = Double.valueOf(d2);
    }

    public final void p(double d2) {
        this.i = Double.valueOf(d2);
    }

    public final void q(double d2) {
        this.l = Double.valueOf(d2);
    }

    public final void r(double d2) {
        this.m = Double.valueOf(d2);
    }

    public final void s(double d2) {
        this.r = Double.valueOf(d2);
    }

    public final void b(int i2) {
        this.f = Integer.valueOf(i2);
    }

    public final void c(boolean z2) {
        this.D = Boolean.valueOf(z2);
    }

    public final void d(boolean z2) {
        this.C = Boolean.valueOf(z2);
    }

    public final void e(boolean z2) {
        this.B = Boolean.valueOf(z2);
    }

    public final void f(boolean z2) {
        this.t = Boolean.valueOf(z2);
    }

    public final void g(boolean z2) {
        this.z = Boolean.valueOf(z2);
    }

    public final void h(boolean z2) {
        this.A = Boolean.valueOf(z2);
    }

    public final void i(boolean z2) {
        this.y = Boolean.valueOf(z2);
    }

    public final void b(boolean z2) {
        this.J = Boolean.valueOf(z2);
    }

    public final void a(double d2) {
        this.o = Double.valueOf(d2);
    }

    public final void a(int i2) {
        this.H = Integer.valueOf(i2);
    }

    public final void a(aqio aqio) {
        if (aqio != null) {
            this.G = aqio;
            return;
        }
        throw new NullPointerException("Null bluemoonEventLogger");
    }

    public final void a(boolean z2) {
        this.u = Boolean.valueOf(z2);
    }
}
