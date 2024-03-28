def get_honor_path(honor_score, target_honor_score):
    if honor_score >= target_honor_score:
        return {}

    diff = target_honor_score - honor_score
    one_kyus = diff // 2
    two_kyus = diff - one_kyus

    return {
        '2kyus': two_kyus - one_kyus,
        '1kyus': one_kyus
    }
