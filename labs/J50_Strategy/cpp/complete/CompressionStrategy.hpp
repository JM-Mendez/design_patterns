#pragma once

#include "Stream.hpp"

class CompressionStrategy
{
public:
	virtual Stream compress(Stream uncompressed) = 0;
};
