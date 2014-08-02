String data = "東京スカイツリーの高さは634m、東京タワーは333m"
result = data.replaceAll(/(\d+)m/) { g0, g1 ->
	(g1 as double) * 3.281 + "フィート"
}

assert result ==
"東京スカイツリーの高さは2080.154フィート、東京タワーは1092.573フィート"

