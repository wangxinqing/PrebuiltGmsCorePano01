package defpackage;

/* renamed from: aifx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aifx {
    static aqgs a(aqio aqio, aihe aihe) {
        aqib i = aqic.i();
        i.g(ayam.a.a().reInitAccuracyThresholdMultiplierGnss());
        i.h(ayam.a.a().reInitAccuracyThresholdMultiplierWifi());
        i.a(ayam.a.a().initializationWindowLengthS());
        i.c(ayam.a.a().maxGnssEvidenceAgeS());
        i.f(ayam.a.a().maxWifiEvidenceAgeS());
        i.e(ayam.a.a().maxStepEvidenceAgeS());
        i.b(ayam.a.a().maxBearingGapS());
        i.d(ayam.a.a().maxGnssWifiDistanceForGnssOnlyM());
        aqic a = i.a();
        aqhu K = aqhw.K();
        aqjp c = aqjq.c();
        c.a(System.currentTimeMillis());
        K.a = c.a();
        K.b((int) ayam.a.a().numberOfParticles());
        K.n(ayam.a.a().resamplingThreshold());
        K.o(ayam.a.a().stepLengthFactor());
        K.p(ayam.a.a().stepLengthNoiseSigmaM());
        K.g(ayam.a.a().nominalSigmaScaleGnss());
        K.h(ayam.a.a().nominalSigmaScaleWifi());
        K.q(ayam.a.a().temporalHeadingNoiseSigmaRad());
        K.r(ayam.a.a().temporalPositionNoiseSigmaM());
        K.i(ayam.a.a().positionEmitThresholdS());
        K.a(ayam.a.a().accuracyFactor());
        K.f(ayam.a.a().minAccuracyM());
        K.e(ayam.a.a().maxAccuracyM());
        K.s((double) ayam.a.a().wifiAccuracyUpperBoundBeforeRejectedMm());
        K.m(ayam.a.a().flpParticleFusionRejectionThresholdSigmaMultiplier());
        K.f(ayam.a.a().flpParticleFusionUsePositionLikelihoodClipping());
        K.i(aycp.a.a().useCarryBearingTracker());
        K.g(ayam.a.a().resetLocationAfterReinit());
        K.h(ayam.a.a().resetLocationAfterReinitV2());
        K.e(ayam.a.a().flpParticleFusionExtendedBugReport());
        K.d(ayam.a.a().enableDifferentialBearingFix140500114());
        K.a(ayam.a.a().allowProposingFromGnss());
        K.k(ayam.a.a().positionProposalGnssMaxAccuracyThresholdM());
        K.l(ayam.a.a().positionProposalGnssMinSpeedThresholdMps());
        K.d = a;
        aqih f = aqii.f();
        f.e(ayam.a.a().gnssStdDevScale());
        f.b(ayam.a.a().gnssMinStdDevM());
        f.a(ayam.a.a().gnssMaxStdDevM());
        f.c(ayam.a.a().gnssRejectionDistanceM());
        f.d(ayam.a.a().gnssRejectionPeriodS());
        K.b = f.a();
        aqih g = aqii.g();
        g.e(ayam.a.a().wifiStdDevScale());
        g.b(ayam.a.a().wifiMinStdDevM());
        g.a(ayam.a.a().wifiMaxStdDevM());
        g.c(ayam.a.a().wifiRejectionDistanceM());
        g.d(ayam.a.a().wifiRejectionPeriodS());
        K.c = g.a();
        K.a(aqio);
        K.a((int) ayam.a.a().flpParticleFusionBugReportMaxBufferSize());
        K.d(ayam.a.a().flpParticleFusionBugReportWindowSec());
        K.b(ayam.a.a().flpParticleFusionBugReportStoreDataArrayOnly());
        K.c(ayam.c());
        aqhz c2 = aqia.c();
        c2.b(ayam.a.a().blueskyShadowsProbabilityDensityForInvalidGrid());
        c2.a(ayam.a.a().blueskyShadowsProbabilityDeweightingFactor());
        K.e = c2.a();
        K.b(ayam.a.a().blueskyUpdateMaxAgeS());
        K.j(ayam.a.a().positionProposalGnssBlueskyMinSpeedThresholdMps());
        K.c(ayam.a.a().blueskyUpdateTimeoutForProposeFromGnssSec());
        aqhw a2 = K.a();
        aqhx f2 = aqhy.f();
        f2.a = a2;
        f2.c(ayam.a.a().notRequestWifiScansWhenProposingFromGnss());
        f2.a(ayam.a.a().maxGnssAgeForNotRequestingWifiScansS());
        f2.b(axxm.k());
        f2.a(ayam.a.a().enableBearingRangeFix143083454());
        aqhy a3 = f2.a();
        aqis aqis = new aqis();
        return new aqgs(aihe, a3, aqis, new aqip(((aqho) a3).e, aqis));
    }
}