import groovy.xml.MarkupBuilder

def xml = new MarkupBuilder()

xml.Products(null,
	{
			Product(type:'regular',
				{
						Name('Instant Noodle')
						Price(147)
				}
			)
	}
)
